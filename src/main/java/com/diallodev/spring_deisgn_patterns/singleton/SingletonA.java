package com.diallodev.spring_deisgn_patterns.singleton;

public class SingletonA {

    private static SingletonA instance;

    private SingletonA() {
        super();
    }

    public static SingletonA getInstance() {
        if (null == instance) {
           synchronized (SingletonA.class) {
               if (instance == null) {
                   instance = new SingletonA();
               }
           }
        }
        return instance;
    }
}
