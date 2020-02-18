package com.shardingjdbc.singledatabase;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.shardingjdbc.singledatabase.dao"}) //扫描DAO

public class SingledatabaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SingledatabaseApplication.class, args);
    }

}
