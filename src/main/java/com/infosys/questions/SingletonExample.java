package com.infosys.questions;

public class SingletonExample {
    private static volatile SingletonExample _instance;

    public static SingletonExample getInstance() {
        if( _instance == null) {
            synchronized (SingletonExample.class) {
                if(_instance == null) {
                    _instance = new SingletonExample();
                }
            }
        }
        return _instance;
    }
}
