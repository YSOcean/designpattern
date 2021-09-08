package com.itcoke.designpattern.proxy.staticproxy;

public interface IUserController {
    // 登录
    String login(String username,String password);
    // 注册
    String register(String username,String password);
}
