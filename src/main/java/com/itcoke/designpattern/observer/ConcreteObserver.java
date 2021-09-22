package com.itcoke.designpattern.observer;

/**
 * 具体观察者
 */
public class ConcreteObserver implements Observer {
    @Override
    public void update() {
        System.out.println("接受到信息，并进行处理");
    }
}
