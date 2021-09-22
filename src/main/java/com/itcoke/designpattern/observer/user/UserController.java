package com.itcoke.designpattern.observer.user;

public class UserController {

    public void register(String userName, String passWord) {
        // 1、根据用户名密码保存在数据库
        Long userId = saveUser(userName, passWord);
        // 2、如果上一步有结果则发送一封欢迎邮件
        if (userId != null) {
            Mail.sendEmail(userId);
        }
    }


    public Long saveUser(String userName, String passWord) {
        return 1L;
    }
}
