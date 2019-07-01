package com.bruce.mybatisspringboot.service;

import com.bruce.model.SysUser;

import java.util.List;

/**
 * @Author: Bruce
 * @Date: 2019/7/1 16:50
 * @Version 1.0
 */
public interface UserService {

    SysUser findById(Long id);

    List<SysUser> findAll();
}
