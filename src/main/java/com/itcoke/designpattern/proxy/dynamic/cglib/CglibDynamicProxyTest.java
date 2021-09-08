package com.itcoke.designpattern.proxy.dynamic.cglib;

public class CglibDynamicProxyTest {
    public static void main(String[] args) {
        UserController userController = new UserController();
        CglibDynamicProxy cglibDynamicProxy = new CglibDynamicProxy(userController);
        UserController o = (UserController)cglibDynamicProxy.newProxyInstance();
        o.login("username","password");
        o.register("username","password");
    }
}
