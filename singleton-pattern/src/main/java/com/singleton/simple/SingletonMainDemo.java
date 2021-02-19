package com.singleton.simple;

public class SingletonMainDemo {
    public static void main(String[] args) {
        // 无法使用构造函数
        // 编译时错误：构造函数 SimpleSingle() 是不可见的
        // SimpleSingle object = new SimpleSingle();

        // 获取唯一可用的对象
        SimpleSingle object = SimpleSingle.getInstance();

        // 显示消息
        object.showMessage();
    }
}
