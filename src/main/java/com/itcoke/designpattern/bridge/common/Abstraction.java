package com.itcoke.designpattern.bridge.common;

public abstract class Abstraction {
    // 定义对实现化角色的引用
    private Implementor implementor;

    public Abstraction(Implementor implementor){
        this.implementor = implementor;
    }

    // 自身的行为和属性
    public void request(){
        this.implementor.doSomething();
    }

    // 获取实现化角色
    public Implementor getImplementor(){
        return implementor;
    }
}
