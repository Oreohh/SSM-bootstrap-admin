package com.zelot.ModelDo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;


/**
 * dev_manager
 * @Zelot
 */

//对象序列化接口
public class Device implements Serializable{
    private Integer id;

    /**
     * 设备号
     */
    private String devNo;

    /**
     * 设备名
     */
    private String devName;
    /**
     *
     * 设备类型：1表示智能电灯；
     *          2表示智能空调；
     *          3表示智能窗帘
     *          4表示手机
     *          5表示电脑
     */
    private Integer devType;
    /**
     * 设备买入时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date devBuydate;

    /**
     * 设备保修日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date devWarrantydate;

    /**
     * 设备状态 0代表离线 1代表在线
     */
    private Boolean devStatus;

    /**
     * 设备信息创建时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Timestamp dateCreate;

    /**
     * 设备近次维护时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date devRepairdate;

    /**
     * 设备信息近次更新时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Timestamp dateUpdate;

    /**
     * 图片路径
     */
    private String img;
    /**
     * 设备类型，string类型
     */
    private String sDevType;

    private static final long serialVersionUID = 1L;

    //getter
    public Integer getId() {
        return id;
    }
    public String getDevNo() {
        return devNo;
    }
    public String getDevName() {
        return devName;
    }
    public Date getDevBuydate() {
        return devBuydate;
    }
    public Date getDevWarrantydate() {
        return devWarrantydate;
    }
    public Boolean getDevStatus() {
        return devStatus;
    }
    public Timestamp getDateCreate() {
        return dateCreate;
    }
    public Date getDevRepairdate() {
        return devRepairdate;
    }
    public Timestamp getDateUpdate() {
        return dateUpdate;
    }
    public Integer getDevType() { return devType; }
    public String getImg() {
        return img;
    }
    public String getsDevType() {
        return sDevType;
    }

    //setter
    public void setId(Integer id) { this.id = id; }
    public void setDevNo(String devNo) { this.devNo = devNo; }
    public void setDevName(String devName) { this.devName = devName; }
    public void setDevBuydate(Date devBuydate) { this.devBuydate = devBuydate; }
    public void setDevWarrantydate(Date devWarrantydate) { this.devWarrantydate = devWarrantydate; }
    public void setDevStatus(Boolean devStatus) { this.devStatus = devStatus; }
    public void setDateCreate(Timestamp dateCreate) { this.dateCreate = dateCreate; }
    public void setDevRepairdate(Date devRepairdate) { this.devRepairdate = devRepairdate; }
    public void setDateUpdate(Timestamp dateUpdate) { this.dateUpdate = dateUpdate; }
    public void setDevType(Integer devType) { this.devType = devType; }
    public void setImg(String img) {
        this.img = img;
    }
    public void setsDevType(String sDevType) {
        this.sDevType = sDevType;
    }
}