package com.itcoke.designpattern.observer.user.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 发送手机短信——观察者
 */
public class SMSObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("发送短信：" + arg + "欢迎你");
    }
}
