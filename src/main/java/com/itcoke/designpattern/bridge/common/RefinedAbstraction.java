package com.itcoke.designpattern.bridge.common;

public class RefinedAbstraction extends  Abstraction{
    // 覆写构造函数
    public RefinedAbstraction(Implementor implementor){
        super(implementor);
    }

    // 修正父类的行为
    @Override
    public void request() {
        super.request();
    }
}
