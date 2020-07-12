package com.zelot.Support.Eunums;

public enum DeviceTypeEnum {
    LIGHT(1,"智能电灯","img/light.jpg"),
    AirConditioner(2,"智能空调","img/airConditioner.jpg"),
    CURTAIN(3,"智能窗帘","img/Curtain.jpg"),
    CelePhone(4,"智能手机","img/phone.jpg"),
    Computer(5,"电脑","img/computer.jpg")
    ;

    /**
     *  类型值
     */
    private Integer type;
    /**
     * 描述
     */
    private String desc;
    /**
     * 图片路径
     */
    private String imgSrc;

    DeviceTypeEnum(Integer type, String desc, String src){
        this.type=type;
        this.desc=desc;
        this.imgSrc=src;
    }

    public Integer getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }

    public String getImgSrc() {
        return imgSrc;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    public static DeviceTypeEnum getDevTypeEnum(Integer devType){
        for(DeviceTypeEnum deviceTypeEnum: DeviceTypeEnum.values()){
            if(deviceTypeEnum.getType().equals(devType))
            return deviceTypeEnum;
        }
        throw  new RuntimeException("No relative device");
    }
}
