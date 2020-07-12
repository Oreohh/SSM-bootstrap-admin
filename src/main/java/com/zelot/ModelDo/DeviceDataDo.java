package com.zelot.ModelDo;

import java.io.Serializable;
import java.util.Date;


public class DeviceDataDo implements Serializable{

    private static final long serialVersionUID = 1L;
    /**
     * 设备号
     */
    private long deviceId;
    /**
     *  上传日期
     */
    private Date UploadDate;
    /**
     * 数据
      */
    private String data;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getDeviceId() {
        return deviceId;
    }

    public Date getUploadDate() {
        return UploadDate;
    }

    public String getData() {
        return data;
    }

    public void setDeviceId(long deviceId) {
        this.deviceId = deviceId;
    }

    public void setUploadDate(Date uploadDate) {
        UploadDate = uploadDate;
    }

    public void setData(String data) {
        this.data = data;
    }

}
