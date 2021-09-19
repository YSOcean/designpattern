package com.itcoke.designpattern.flyweight;

/**
 * 具体享元角色1
 */
public class ConcreteFlyweight1 extends Flyweight{

    protected ConcreteFlyweight1(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate() {
        System.out.println("具体享元角色1");
    }
}
