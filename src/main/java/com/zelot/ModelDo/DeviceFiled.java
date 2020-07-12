package com.zelot.ModelDo;

import java.util.Date;

public class DeviceFiled {
    /**
     * 主键
     */
    private Integer id;
    /**
     * 设备id
     */
    private Integer devId;
    /**
     * 字段key
     */
    private String filedKey;
    /**
     * 字段值
     */
    private String filedValue;
    /**
     * 创建时间
     */
    private Date dateCreate;

    public long getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public long getDevId() {
        return devId;
    }

    public void setDevId(Integer devId) {
        this.devId = devId;
    }

    public String getFiledKey() {
        return filedKey;
    }

    public void setFiledKey(String fieldKey) {
        this.filedKey = fieldKey;
    }

    public String getFiledValue() {
        return filedValue;
    }

    public void setFiledValue(String fieldValue) {
        this.filedValue = fieldValue;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }
}
