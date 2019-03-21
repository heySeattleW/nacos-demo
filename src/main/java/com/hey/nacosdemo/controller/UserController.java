package com.hey.nacosdemo.controller;

import com.hey.nacosdemo.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName UserController
 * @Author hey
 * @Date 2019/3/18 10:31
 **/
@RestController
@RefreshScope
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Value("${spring.datasource.url}")
    private String url;

    @RequestMapping(value = "get",method = RequestMethod.GET)
    public String get(){
        System.out.println("数据源url来了："+url);
        return userRepository.findById(1).toString();
    }
}
