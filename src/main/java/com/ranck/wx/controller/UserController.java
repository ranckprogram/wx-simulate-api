package com.ranck.wx.controller;

import com.ranck.wx.domain.Result;
import com.ranck.wx.domain.User;
import com.ranck.wx.service.UserService;
import com.ranck.wx.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public Result AddUser (User user) {
        userService.addUser(user);
        return ResultUtil.success();
    }

    @GetMapping("/user/{id}")
    public Result getUserInfoById (@PathVariable("id") Integer id) {
        return ResultUtil.success(userService.getUserById(id));
    }

}
