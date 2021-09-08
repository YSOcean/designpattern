package com.itcoke.designpattern.proxy.staticproxy;

public class UserControllerProxy implements IUserController{
    private IUserController userController;

    public UserControllerProxy(IUserController userController){
        this.userController = userController;
    }
    @Override
    public String login(String username, String password) {
        long startTime = System.currentTimeMillis();
        // 登录逻辑
        userController.login("username","password");
        long endTime = System.currentTimeMillis();
        long responseTime = endTime - startTime;
        System.out.println("接口响应时间："+responseTime);
        return null;
    }

    @Override
    public String register(String username, String password) {
        long startTime = System.currentTimeMillis();
        // 注册逻辑
        userController.register("username","password");
        long endTime = System.currentTimeMillis();
        long responseTime = endTime - startTime;
        System.out.println("接口响应时间："+responseTime);
        return null;
    }
}
