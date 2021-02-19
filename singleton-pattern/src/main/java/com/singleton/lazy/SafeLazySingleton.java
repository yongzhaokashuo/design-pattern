package com.singleton.lazy;

public class SafeLazySingleton {
    private static SafeLazySingleton instance;
    private SafeLazySingleton(){}

    public static synchronized SafeLazySingleton getInstance() {
        if (instance == null) {
            instance = new SafeLazySingleton();
        }
        return instance;
    }
}
