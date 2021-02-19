package com.singleton.lazy;

public class NotSafeLazySingleton {
    private static NotSafeLazySingleton instance;
    private NotSafeLazySingleton(){}

    public static NotSafeLazySingleton getInstance() {
        if (instance == null) {
            instance = new NotSafeLazySingleton();
        }
        return instance;
    }
}
