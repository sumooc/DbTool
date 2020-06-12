package com.xiwei.sumooc.service;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface OperateDbService {

    Map<String, Object> getDataById(int id);

    Map<String, Object> getDataByMap(Map<String, Object> params);

    List<Map<String, Object>> getAllDataByMap(Map<String, Object> params);
}
