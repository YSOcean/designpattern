package com.itcoke.designpattern.template.callback;

public class BClass {
    public void process(ICallback callback) {
        System.out.println("BClass start");
        callback.methodToCallback();
        System.out.println("BClass end");
    }
}
