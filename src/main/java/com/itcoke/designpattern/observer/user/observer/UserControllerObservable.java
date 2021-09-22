package com.itcoke.designpattern.observer.user.observer;


import java.util.Observable;

/**
 * 用户登录——被观察者
 */
public class UserControllerObservable extends Observable {


    public void register(String userName, String passWord) {
        // 1、根据用户名密码保存在数据库
        Long userId = saveUser(userName, passWord);
        // 2、如果上一步有结果则通知所有观察者
        if (userId != null) {
            super.setChanged();
            super.notifyObservers(userName);
        }
    }

    public Long saveUser(String userName, String passWord) {
        return 1L;
    }

}
