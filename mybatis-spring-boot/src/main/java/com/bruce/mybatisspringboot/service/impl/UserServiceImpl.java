package com.bruce.mybatisspringboot.service.impl;

import com.bruce.mapper.UserMapper;
import com.bruce.model.SysUser;
import com.bruce.mybatisspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Bruce
 * @Date: 2019/7/1 16:51
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public SysUser findById(Long id) {
        return userMapper.selectById(id);
    }

    @Override
    public List<SysUser> findAll() {
        return userMapper.selectAll();
    }
}
