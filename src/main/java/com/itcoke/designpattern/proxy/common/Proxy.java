package com.itcoke.designpattern.proxy.common;

/**
 * 代理主题角色
 */
public class Proxy implements Subject{
    //要代理的具体实现类
    private Subject realSubject;

    public Proxy(Subject realSubject){
        this.realSubject = realSubject;
    }
    @Override
    public void doSomething() {
        this.before();
        realSubject.doSomething();
        this.after();
    }

    // 预处理
    private void before(){
        // TODO
    }

    // 善后处理
    private void after(){
        // TODO
    }
}
