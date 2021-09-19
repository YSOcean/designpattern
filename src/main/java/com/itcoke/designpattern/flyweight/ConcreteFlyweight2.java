package com.itcoke.designpattern.flyweight;

/**
 * 具体享元角色2
 */
public class ConcreteFlyweight2 extends Flyweight{

    protected ConcreteFlyweight2(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate() {
        System.out.println("具体享元角色2");
    }
}
