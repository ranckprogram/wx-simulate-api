package com.ranck.wx.controller;

import com.ranck.wx.domain.Address;
import com.ranck.wx.domain.Result;
import com.ranck.wx.service.AddressService;
import com.ranck.wx.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    @GetMapping("/addressList")
    public Result getAddressList (@RequestParam Integer id) {
        List<Address> addressList = addressService.getAddressList(id);
        return ResultUtil.success(addressList);
    }

}
