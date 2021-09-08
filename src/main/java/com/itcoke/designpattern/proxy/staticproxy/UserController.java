package com.itcoke.designpattern.proxy.staticproxy;

public class UserController implements IUserController{
    @Override
    public String login(String username, String password) {
        // TODO 登录逻辑
        System.out.println("登录");
        return null;
    }

    @Override
    public String register(String username, String password) {
        // TODO 注册逻辑
        System.out.println("注册");
        return null;
    }
}
