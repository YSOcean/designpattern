package com.itcoke.designpattern.proxy.staticproxy.jicheng;

import com.itcoke.designpattern.proxy.staticproxy.UserController;

public class UserControllerProxy extends UserController {
    @Override
    public String login(String username, String password) {
        long startTime = System.currentTimeMillis();
        // 登录逻辑
        super.login("username","password");
        long endTime = System.currentTimeMillis();
        long responseTime = endTime - startTime;
        System.out.println("接口响应时间："+responseTime);
        return null;
    }

    @Override
    public String register(String username, String password) {
        long startTime = System.currentTimeMillis();
        // 注册逻辑
        super.register("username","password");
        long endTime = System.currentTimeMillis();
        long responseTime = endTime - startTime;
        System.out.println("接口响应时间："+responseTime);
        return null;
    }
}
