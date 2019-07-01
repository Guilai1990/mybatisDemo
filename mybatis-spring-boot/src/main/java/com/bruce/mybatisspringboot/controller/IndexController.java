package com.bruce.mybatisspringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Bruce
 * @Date: 2019/7/1 13:06
 * @Version 1.0
 */
@RestController
public class IndexController {

    @RequestMapping("/")
    String home() {
        return "hello world";
    }
}
