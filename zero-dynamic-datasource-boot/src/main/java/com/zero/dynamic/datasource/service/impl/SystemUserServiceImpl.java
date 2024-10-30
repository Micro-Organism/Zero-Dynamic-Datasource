package com.zero.dynamic.datasource.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zero.dynamic.datasource.domain.entity.SystemUserEntity;
import com.zero.dynamic.datasource.mapper.SystemUserMapper;
import com.zero.dynamic.datasource.service.SystemUserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@DS("slave_1")
public class SystemUserServiceImpl extends ServiceImpl<SystemUserMapper, SystemUserEntity> implements SystemUserService {

    @Resource
    SystemUserMapper userInfoMapper;

    @Override
    @DS("master")
    public List<SystemUserEntity> testQueryWrapper(int age) {
        QueryWrapper<SystemUserEntity> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.ge("age", age);
        List<SystemUserEntity> userList = userInfoMapper.selectList(userQueryWrapper);
        return userList;
    }
}
