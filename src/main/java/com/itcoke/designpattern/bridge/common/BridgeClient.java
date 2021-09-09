package com.itcoke.designpattern.bridge.common;

public class BridgeClient {
    public static void main(String[] args) {
        // 定义一个实现化角色
        Implementor implementor = new ConcreteImplementor1();
        // 定义一个抽象化角色
        Abstraction abstraction = new RefinedAbstraction(implementor);
        // 执行方法
        abstraction.request();

    }
}
