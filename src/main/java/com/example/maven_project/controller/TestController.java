package com.example.maven_project.controller;

import com.example.maven_project.dto.UserInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class TestController {

    @GetMapping
    public UserInfo getUserInfo(){
        UserInfo userInfo = new UserInfo();
        userInfo.setName("Mia Hossain");
        userInfo.setEmail("miahossain@gmail.com");
        userInfo.setUserName("hossian");
        return userInfo;
    }

    @PostMapping
    public UserInfo setUserInfo(){
        UserInfo userInfo = new UserInfo();
        userInfo.setName("Mia Hossain");
        userInfo.setEmail("miahossain@gmail.com");
        userInfo.setUserName("hossian");
        return userInfo;
    }
}
