package com.zelot.dao;

import com.zelot.ModelDo.DeviceFiled;

import java.util.List;

public interface DeviceFiledDao {
    int deleteByPrimaryKey(Integer id);

    int insert(DeviceFiled record);

    int insertSelective(DeviceFiled record);

    DeviceFiled selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DeviceFiled record);

    int updateByPrimaryKey(DeviceFiled record);

    List<DeviceFiled> selectByDevId(Integer devId);
}