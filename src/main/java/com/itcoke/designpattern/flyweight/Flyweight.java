package com.itcoke.designpattern.flyweight;

/**
 * 抽象享元角色
 */
public abstract class Flyweight {
    // 内部状态
    private String instrinsic;

    // 外部状态 通过 final 修改，防止修改
    protected final String extrinsic;

    protected Flyweight(String extrinsic) {
        this.extrinsic = extrinsic;
    }

    // 定义业务操作
    public abstract void operate();

    public String getInstrinsic() {
        return instrinsic;
    }

    public void setInstrinsic(String instrinsic) {
        this.instrinsic = instrinsic;
    }
}
