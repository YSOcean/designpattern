package com.itcoke.designpattern.singleton;

//懒汉模式线程安全--volatile
public class Singleton {
    //构造器私有化
    private Singleton(){

    }
    //在类的内部自己创建实例的引用
    private static volatile Singleton singleton = null;

    //提供get 方法以供外界获取单例
    public static Singleton getInstance() throws Exception{
        if(singleton == null){
            synchronized (Singleton.class) {
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

}


