package com.ranck.wx.controller;

import com.ranck.wx.domain.Result;
import com.ranck.wx.service.AuthService;
import com.ranck.wx.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class AuthController {

    @Autowired
    AuthService authService;

    @PostMapping("/login")
    public Result login(@RequestBody HashMap<String, String> map) {
        String wx = map.get("wx");
        String password = map.get("password");
        return ResultUtil.success(authService.login(wx, password));
    }
}
