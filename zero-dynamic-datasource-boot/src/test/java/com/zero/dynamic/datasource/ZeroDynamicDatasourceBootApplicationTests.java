package com.zero.dynamic.datasource;

import com.zero.dynamic.datasource.domain.entity.SystemUserEntity;
import com.zero.dynamic.datasource.service.SystemUserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class ZeroDynamicDatasourceBootApplicationTests {

    @Autowired
    SystemUserService userInfoService;

    @BeforeEach
    public void before()  {
        log.info("init some data");
    }

    @AfterEach
    public void after(){
        log.info("clean some data");
    }

    @Test
    public void execute()  {
        log.info("your method test Code");
    }

    @Test
    public void query()  {
        log.info("your method test Code");
        userInfoService.lambdaQuery().list().forEach(System.out::println);
    }

    @Test
    public void testQueryWrapper()  {
        log.info("your method test Code");
        userInfoService.testQueryWrapper(3).forEach(System.out::println);
    }

    @Test
    public void insert()  {
        log.info("your method test Code");

        for(int i =1;i<10;i++) {
            SystemUserEntity ui =  new SystemUserEntity();
            ui.setUserId(i+"id");
            userInfoService.removeById(i+"id");
            ui.setUsername("HBLOG"+i);
            ui.setAge(i);
            userInfoService.save(ui);
        }
    }

}
