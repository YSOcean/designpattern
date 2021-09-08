package com.itcoke.designpattern.proxy.dynamic;

import com.itcoke.designpattern.proxy.staticproxy.IUserController;
import com.itcoke.designpattern.proxy.staticproxy.UserController;

import java.lang.reflect.Proxy;

public class DynamicProxyTest {
    public static void main(String[] args) {
        // 1、创建具体主题类
        IUserController userController = new UserController();
        // 2、创建 Handler
        DynamicProxyHandler proxyHandler = new DynamicProxyHandler(userController);
        // 3、动态产生代理类
        IUserController o = (IUserController)Proxy.newProxyInstance(userController.getClass().getClassLoader(),
                userController.getClass().getInterfaces(),
                proxyHandler);
        o.login("username","password");
        o.register("username","password");
    }
}
