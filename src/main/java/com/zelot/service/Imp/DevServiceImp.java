package com.zelot.service.Imp;

import com.zelot.ModelDo.Device;
import com.zelot.ModelDo.DeviceFiled;
import com.zelot.Support.Eunums.DeviceTypeEnum;
import com.zelot.dao.DeviceDao;
import com.zelot.dao.DeviceFiledDao;
import com.zelot.service.DevService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DevServiceImp implements DevService {

    @Autowired
    DeviceDao deviceDao;

    @Autowired
    DeviceFiledDao deviceFiledDao;

    @Override
    public boolean deleteByPrimaryKey(Integer id) {
        if(deviceDao.deleteByPrimaryKey(id))
            return true;
        return false;
    }

    @Override
    public boolean insertSelective(Device record) {
        System.out.println(record.getDevBuydate());
        if(deviceDao.insertSelective(record))
            return true;
        return false;
    }

    @Override
    public Device selectByPrimaryKey(Integer id) {
        return deviceDao.selectByPrimaryKey(id);
    }

    @Override
    public List<DeviceFiled> selectDeviceFiledByDevId(Integer devId) {
        return deviceFiledDao.selectByDevId(devId);
    }

    @Override
    public List<Device> selectAll() {
        List<Device> devices=deviceDao.selectAll();
        for(Device device:devices){
            device.setImg(DeviceTypeEnum.getDevTypeEnum(device.getDevType()).getImgSrc());
            device.setsDevType(DeviceTypeEnum.getDevTypeEnum(device.getDevType()).getDesc());
        }
        return devices;
    }

    @Override
    public List<Device> selectByLimit(Integer page, Integer limit) {
        int offset=(page-1)*limit;
        return deviceDao.selectByLimit(offset,limit);
    }

    @Override
    public boolean updateByPrimaryKeySelective(Device record) {
        if(deviceDao.updateByPrimaryKeySelective(record))
            return true;
        return false;
    }
}
