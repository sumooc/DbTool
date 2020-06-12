package com.xiwei.sumooc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.xiwei.sumooc.service.OperateDbService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController()
@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.xiwei.sumooc.mapper")
class SumoocApplicationTests {

    @Autowired
    OperateDbService operateDbService;

    @Test
    void getUsers() {
        Map<String, Object> params = new HashMap<>();
        //可填
        params.put("depCode","");
        params.put("batchId","");
        params.put("orgId","");
        params.put("siTypeId","");

        //必填
        params.put("hospId","1");

        params.put("dtFrom","2020-01-01 00:00:00");
        params.put("dtTo","2020-06-01 23:59:59");


        params.put("page","1");
        params.put("limit","10");
        List<Map<String, Object>> mapList = operateDbService.getAllDataByMap(params);
        Gson gson = new Gson();
        System.out.println(gson.toJson(mapList));
    }

}
