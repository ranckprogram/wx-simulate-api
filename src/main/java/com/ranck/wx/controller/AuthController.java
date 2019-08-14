package com.ranck.wx.controller;

import com.ranck.wx.domain.Result;
import com.ranck.wx.service.AuthService;
import com.ranck.wx.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    AuthService authService;

    @PostMapping("/login")
    public Result login(@RequestParam String wx, @RequestParam String password) {
        return ResultUtil.success(authService.login(wx, password));
    }
}
