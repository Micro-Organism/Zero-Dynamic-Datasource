package com.zero.dynamic.datasource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zero.dynamic.datasource.mapper")
public class ZeroDynamicDatasourceBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZeroDynamicDatasourceBootApplication.class, args);
    }

}
