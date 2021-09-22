package com.itcoke.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者
 */
public abstract class Subject {
    // 定义一个被观察者数组
    private List<Observer> obsList = new ArrayList<>();

    // 增加一个观察者
    public void addObserver(Observer observer) {
        obsList.add(observer);
    }

    // 删除一个观察者
    public void delObserver(Observer observer) {
        obsList.remove(observer);
    }

    // 通知所有观察者
    public void notifyObservers() {
        for (Observer observer : obsList) {
            observer.update();
        }
    }
}
