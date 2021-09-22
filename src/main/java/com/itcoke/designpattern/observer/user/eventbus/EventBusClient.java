package com.itcoke.designpattern.observer.user.eventbus;


import java.util.ArrayList;
import java.util.List;

public class EventBusClient {
    public static void main(String[] args) {
        UserController userController = new UserController();
        List<Object> observerList = new ArrayList<>();
        observerList.add(new MailObserver());
        observerList.add(new SMSObserver());
        userController.setObserverList(observerList);
        userController.register("张三", "123");
    }
}
