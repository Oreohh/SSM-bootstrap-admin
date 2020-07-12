package com.zelot.controller;

import com.zelot.ModelDo.Device;
import com.zelot.ModelDo.DeviceFiled;
import com.zelot.Support.Eunums.RoleEnum;
import com.zelot.Support.Result;
import com.zelot.Support.ResultSupport;
import com.zelot.annotations.Permissions;
import com.zelot.service.DevService;
import org.apache.ibatis.annotations.Param;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Date;
import java.util.List;

@Controller
public class DevController {

    private static Logger logger = LoggerFactory.getLogger(DevController.class);

    @Autowired
    private DevService devService;
    ObjectMapper mapper = new ObjectMapper();

    @Permissions(role = {RoleEnum.ADMIN})
    @RequestMapping("/device")
    public String GetDeviceList(Model model){
        List<Device> devices = devService.selectAll();
        model.addAttribute("devlist",devices);
        logger.info("get device list");
        return "device";
    }


    @Permissions(role = {RoleEnum.ADMIN})
    @RequestMapping("/device/add")
    public String insert(@Param("devNo") String devNo, @Param("devName")String devName,@Param("devType") Integer devType,
                         @Param("devBuydate") Date devBuydate,
                         @Param("devWarrantydate") Date devWarrantydate, @Param("devStatus") Boolean devStatus)
    {
        try {
//            DeviceTypeEnum deviceTypeEnum = DeviceTypeEnum.getDevTypeEnum(devType);
//            device.setDevType(deviceTypeEnum.getType());
            System.out.println(devBuydate);
            Device device=new Device();
            device.setDevNo(devNo);
            device.setDevName(devName);
            device.setDevType(devType);
            device.setDevBuydate(devBuydate);
            device.setDevWarrantydate(devWarrantydate);
            device.setDevStatus(devStatus);
            if(devService.insertSelective(device))
                logger.info("add device id:"+device.getId());
        }catch (Exception e){
            logger.error("Device add error",e);
        }

        return "device";
    }

    @Permissions(role = {RoleEnum.ADMIN})
    @RequestMapping("/device/update")
    public String devUpdate(@Param("id") Integer id, @Param("devNo") String devNo, @Param("devName")String devName,
                            @Param("devType") Integer devType,
                            @Param("devStatus") boolean devStatus, @Param("devRepairdate") Date devRepairdate)
    {
        Device device = new Device();
        device.setId(id);
        device.setDevNo(devNo);
        device.setDevType(devType);
        device.setDevName(devName);
        device.setDevStatus(devStatus);
        device.setDevRepairdate(devRepairdate);
        devService.updateByPrimaryKeySelective(device);
        logger.info("update device id:"+id);
        return "device";
    }

    @Permissions(role = {RoleEnum.ADMIN})
    @RequestMapping("/device/delete")
    public String devDelete(Integer id){
        Integer dev_id = new Integer(id);
        devService.deleteByPrimaryKey(dev_id);
        logger.info("delete device id:"+dev_id);
        return "device";
    }
    @Permissions(role = {RoleEnum.ADMIN,RoleEnum.NORMAL})
    @RequestMapping("/device/edit")
    @ResponseBody
    public Device edit(@Param("id") Integer id){
        logger.info("get device id:"+id);
        return devService.selectByPrimaryKey(id);
    }

    @Permissions(role = {RoleEnum.ADMIN, RoleEnum.NORMAL})
    @RequestMapping("/listDeviceFiled")
    @ResponseBody
    public Result<List<DeviceFiled>> listResult(Integer devId){
        System.out.println(devId);
        Result<List<DeviceFiled>> result = new ResultSupport<>(true);
        List<DeviceFiled> deviceFiled=devService.selectDeviceFiledByDevId(devId);
        result.setDataObject(deviceFiled);
        if(deviceFiled==null)
            result.setSuccess(false);
        return result;
    }
}
