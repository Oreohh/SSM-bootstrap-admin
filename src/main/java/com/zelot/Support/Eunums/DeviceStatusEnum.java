package com.zelot.Support.Eunums;

/**
 * 设备状态
 **/
public enum  DeviceStatusEnum {
    onLine(true,"在线"),
    offLine(false,"离线"),
    ;


    /**
     * 值->在线or离线
     **/
    private  boolean value;
    /**
     * 描述
     **/
    private  String desc;

    DeviceStatusEnum(Boolean value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public boolean getValue() {
        return value;
    }

    public String getDesc() {
        return desc;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
