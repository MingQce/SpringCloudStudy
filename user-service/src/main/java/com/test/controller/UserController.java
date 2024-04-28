package com.test.controller;

import com.test.entity.User;
import com.test.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Resource
    UserService service;

    //这里以RESTFul风格为例
    @RequestMapping("/user/{uid}")
    public User findUserById(@PathVariable("uid") int uid){
        System.out.println("我被调用了");
        return service.getUserById(uid);
    }
}
