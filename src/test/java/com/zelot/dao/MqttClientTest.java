package com.zelot.dao;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zelot.Support.Contants;
import com.zelot.Support.Eunums.DeviceStatusEnum;
import org.eclipse.paho.client.mqttv3.*;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

public class MqttClientTest {

    private static final String HOST = "tcp://127.0.0.1:1883";
    private static final String CLIENTID ="client1"; //客户端唯一标识
    private static final String USERNAME ="test";
    private static final String PASSWORD = "123456";

    private  static final String DEV_NO = "SL_8813255";

    private MqttClient mqttClient;
    public void connect()throws MqttException{
        mqttClient = new MqttClient(HOST,CLIENTID,new MemoryPersistence());
        MqttConnectOptions options = new MqttConnectOptions();
        options.setCleanSession(true);
        options.setUserName(USERNAME);
        options.setPassword(PASSWORD.toCharArray());
        options.setConnectionTimeout(100);
        options.setKeepAliveInterval(180);
        options.setAutomaticReconnect(true);
        options.setWill(DEV_NO+ Contants.MOTT_UP, DeviceStatusEnum.offLine.name().getBytes(),0,true);

        mqttClient.setCallback(new MqttCallback() {
            @Override
            public void connectionLost(Throwable cause) {
                System.out.println("连接断开，可以做处理");
            }

            @Override
            public void messageArrived(String topic, MqttMessage message) throws Exception {
                System.out.println("topic: "+topic);
                System.out.println("message: "+message);
            }

            @Override
            public void deliveryComplete(IMqttDeliveryToken token) {
                System.out.println("发送成功后回调");
            }
        });
        mqttClient.connect(options);
        System.out.println("连接成功");
    }

    public void submit(String topic) throws MqttException{
        mqttClient.subscribe(topic, 2);  //qos 服务质量 123
    }

    public void publish(String topic,String msg) throws MqttException {
        MqttMessage mqttMessage = new MqttMessage();
        mqttMessage.setQos(0);
        mqttMessage.setPayload(msg.getBytes());
        MqttTopic mqttTopic = mqttClient.getTopic(topic);
        MqttDeliveryToken token = mqttTopic.publish(mqttMessage);
        token.waitForCompletion();
    }

//    public static void main(String[] args) throws MqttException {
//        MqttClientTest mqttClientTest = new MqttClientTest();
//        ObjectMapper objectMapper = new ObjectMapper();
//        mqttClientTest.connect();
//        String topic = DEV_NO+ Contants.MOTT_UP;
//        //mqttClientTest.submit(topic);
//        Map<String,Object> dataMap = new HashMap<>();
//        dataMap.put("status",true);
//        Timer timer = new Timer();
//        timer.schedule(new TimerTask() {
//            @Override
//            public void run() {
//                try {
//                    mqttClientTest.publish(topic, objectMapper.writeValueAsString(dataMap));
//                }catch (Exception e){
//                    e.printStackTrace();
//                }
//            }
//        },1000,60000);
//    }
}
