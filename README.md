# wx-simulate-api
使用spring boot写的模拟微信的后端api 

## 实体

### 用户

|  字段   | 类型  | 描述 |
|  ----  | ----  | --- |
| phone  | String | 手机号|
| password  | String | 密码|
| username  | String | 昵称 |
| wx  | String | 微信号 |
| avatar  | String | 头像|
| QRcode  | String | 二维码|
| sex  | String | 性别 |
| birth  | String | 生日|
| region  | String | 地区 |
| signature  | String | 个性签名 |




## 模块

### 用户模块 

Get
```
/users
```


|  字段   | 类型  | 描述 |
|  ----  | ----  | --- |
| username  | String | |
| password  | String | |
| wx  | String | |
| sex  | String | |
| birth  | String | |
| avatar  | String | |