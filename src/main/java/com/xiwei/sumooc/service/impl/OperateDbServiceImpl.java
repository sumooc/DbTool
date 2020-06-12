package com.xiwei.sumooc.service.impl;

import com.xiwei.sumooc.mapper.OperateDbDao;
import com.xiwei.sumooc.service.OperateDbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class OperateDbServiceImpl implements OperateDbService {

    @Autowired
    OperateDbDao operateDbDao;

    @Override
    public Map<String, Object> getDataById(int id) {
        return operateDbDao.getDataById(id);
    }

    @Override
    public Map<String, Object> getDataByMap(Map<String, Object> params) {
        return operateDbDao.getDataByMap(params);
    }

    @Override
    public List<Map<String, Object>> getAllDataByMap(Map<String, Object> params) {
        return operateDbDao.getAllDataByMap(params);
    }
}
