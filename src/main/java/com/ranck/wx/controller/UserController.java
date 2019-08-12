package com.ranck.wx.controller;

import com.ranck.wx.domain.User;
import com.ranck.wx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;


    @GetMapping("/hello")
    public String hello () {
        return "hello";
    }

    @PostMapping("/user")
    public String AddUser (User user) {
        userService.addUser(user);
        return  "ok";
    }
}
