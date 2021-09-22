package com.itcoke.designpattern.observer.user.observer;

import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * 发送邮件——观察者
 */
public class MailObserver implements Observer {

    private Executor executor = Executors.newFixedThreadPool(2);

    @Override
    public void update(Observable o, Object arg) {
        executor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("发送邮件:" + arg + "欢迎你");
            }
        });

    }
}
