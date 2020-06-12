package com.xiwei.sumooc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xiwei.sumooc.mapper")
public class SumoocApplication {

    public static void main(String[] args) {
        SpringApplication.run(SumoocApplication.class, args);
    }

}
