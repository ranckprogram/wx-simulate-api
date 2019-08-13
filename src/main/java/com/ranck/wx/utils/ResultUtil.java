package com.ranck.wx.utils;

import com.ranck.wx.domain.Result;

public class ResultUtil {
    // 静态方法
    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(200);
        result.setMessage("操作成功");
        result.setData(object);
        return result;
    }

    public static Result success() {
        return success(null);
    }

    public static Result error(Integer code, String message) {
        Result result = new Result();
        result.setCode(1);
        result.setMessage(message);
        return result;
    }
}
