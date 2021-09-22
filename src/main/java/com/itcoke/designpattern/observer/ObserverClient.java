package com.itcoke.designpattern.observer;

public class ObserverClient {

    public static void main(String[] args) {
        // 创建一个被观察者
        ConcreteSubject subject = new ConcreteSubject();
        // 定义一个观察者
        Observer observer = new ConcreteObserver();
        // 观察者观察被观察者
        subject.addObserver(observer);
        subject.doSomething();

    }
}
