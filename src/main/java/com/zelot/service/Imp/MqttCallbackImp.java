package com.zelot.service.Imp;

import com.zelot.ModelDo.Device;
import com.zelot.Support.Contants;
import com.zelot.Support.Eunums.DeviceStatusEnum;
import com.zelot.dao.DeviceDao;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MqttCallbackImp implements MqttCallback {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private DeviceDao deviceDao;

    // 在断开连接时调用
    @Override
    public void connectionLost(Throwable cause) {
        logger.info("link lost, can try relink");
    }
    // 收到下推消息时的回调
    @Override
    public void messageArrived(String topic, MqttMessage message) throws Exception {
        logger.info("receive message topic:"+ topic);
        logger.info("receive message content:"+ message);
        String devNo = topic.split(Contants.MOTT_UP)[0];  //通过split从topic中剥离设备号
        Device device =  deviceDao.selectByDevNo(devNo);
        if(devNo == null)
            throw new RuntimeException("can't find out relative device");
        //插入mongodb
        String data = message.toString();
//        DeviceDataDo deviceDataDo = new DeviceDataDo();
//        deviceDataDo.setDeviceId(device.getId());
//        deviceDataDo.setData(data);
//        deviceDataDo.setUploadDate(new Date());
//        mongoTemplate.insert(deviceDataDO);
        //更新设备状态
        if(data.contains(DeviceStatusEnum.offLine.name())){
            device.setDevStatus(DeviceStatusEnum.offLine.getValue());
        }else{
            device.setDevStatus(DeviceStatusEnum.onLine.getValue());
        }
        deviceDao.updateByPrimaryKeySelective(device);
    }

    @Override
    public void deliveryComplete(IMqttDeliveryToken token) {
        logger.info("publish success");
    }

}
