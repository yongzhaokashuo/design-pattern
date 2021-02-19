package com.singleton.finalstatic;

public class FinalSingleton {
    private static class SingletonHolder {
        private static final FinalSingleton INSTANCE = new FinalSingleton();
    }
    private FinalSingleton(){}
    public static final FinalSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}