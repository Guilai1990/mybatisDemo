package com.bruce.mybatisspringboot.controller;

import com.bruce.model.SysUser;
import com.bruce.mybatisspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Bruce
 * @Date: 2019/7/1 16:52
 * @Version 1.0
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("users/{id}")
    SysUser user(@PathVariable("id") Long id) {
        return userService.findById(id);
    }

    @RequestMapping("users")
    List<SysUser> users() {
        return userService.findAll();
    }
}
