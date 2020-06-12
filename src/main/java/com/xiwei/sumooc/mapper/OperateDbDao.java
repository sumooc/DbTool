package com.xiwei.sumooc.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface OperateDbDao {

    Map<String, Object> getDataById(int id);

    Map<String, Object> getDataByMap(Map<String, Object> params);

    List<Map<String, Object>> getAllDataByMap(Map<String, Object> params);
}
