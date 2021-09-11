package com.itcoke.designpattern.decorator.common;

/**
 * 具体构件
 */
public class ConcreteComponent extends Component{
    @Override
    public void operator() {
        System.out.println("doSomething");
    }
}
