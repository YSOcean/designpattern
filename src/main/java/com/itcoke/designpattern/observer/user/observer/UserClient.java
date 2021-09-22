package com.itcoke.designpattern.observer.user.observer;


public class UserClient {
    public static void main(String[] args) {
        UserControllerObservable observable = new UserControllerObservable();
        observable.addObserver(new MailObserver());
        observable.addObserver(new SMSObserver());
        observable.register("张三", "123");
    }
}
