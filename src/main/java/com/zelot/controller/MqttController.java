package com.zelot.controller;


import com.zelot.Support.Contants;
import com.zelot.Support.Result;
import com.zelot.Support.ResultSupport;
import com.zelot.service.IMqttService;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@RequestMapping("/mqtt")
public class MqttController {

    private static Logger logger = LoggerFactory.getLogger(MqttController.class);

    @Autowired
    private IMqttService mqttService;

    @RequestMapping("/send")
    @ResponseBody
    public Result<Void> send(@RequestParam(value = "devNo",required = true) String devNo,
                             @RequestParam(value = "data",required = true) String data){

        Result<Void> result = new ResultSupport<>(true);

        try {
            mqttService.publish(devNo + Contants.MOTT_UP,data);
        } catch (MqttException e) {
            logger.error("send error!",e);
            result.setSuccess(false);
            result.setMessage("send failure");
        }

        return result;
    }
}
