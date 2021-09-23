package com.itcoke.designpattern.template.callback.common;

public class SubCallback implements Callback {
    @Override
    public void customOperation() {
        System.out.println("SubCallback customOperation");
    }
}
