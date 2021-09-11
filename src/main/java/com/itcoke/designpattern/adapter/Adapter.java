package com.itcoke.designpattern.adapter;

/**
 * 适配器角色——基于继承
 */
public class Adapter extends Adaptee implements Target{

    @Override
    public void t1() {
        super.a1();
    }

    @Override
    public void t2() {
        super.a2();
    }

    @Override
    public void t3() {
        super.a3();
    }
}
