package com.itcoke.designpattern.observer.user;

public class Mail {
    public static void sendEmail(Long userId) {
        System.out.println("欢迎" + userId);
    }
}
