package com.itcoke.designpattern.proxy.staticproxy;

public class StaticProxyTest {
    public static void main(String[] args) {
        IUserController userController = new UserControllerProxy(new UserController());
        userController.login("username","password");
        userController.register("username","password");
    }
}
