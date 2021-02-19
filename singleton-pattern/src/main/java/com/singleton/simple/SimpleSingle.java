package com.singleton.simple;

public class SimpleSingle {

    // 创建 com.singleton.simple.SimpleSingle 对象
    private static SimpleSingle instance = new SimpleSingle();

    // 构造函数为 private，防止该类被实例化
    private SimpleSingle(){}

    // 获取唯一可用的对象
    public static SimpleSingle getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("这是一个单例");
    }
}