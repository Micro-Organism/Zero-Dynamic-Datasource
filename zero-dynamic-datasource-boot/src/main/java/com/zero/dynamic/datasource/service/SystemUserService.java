package com.zero.dynamic.datasource.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zero.dynamic.datasource.domain.entity.SystemUserEntity;

import java.util.List;


public interface SystemUserService extends IService<SystemUserEntity> {
    List<SystemUserEntity> testQueryWrapper(int age);
}
