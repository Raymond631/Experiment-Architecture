package com.example.task7;

// 饿汉式单例模式
public class VirtualUserGenerator1 {
    private static final VirtualUserGenerator1 instance = new VirtualUserGenerator1();

    private VirtualUserGenerator1() {
        // 私有构造方法，防止外部实例化
    }

    public static VirtualUserGenerator1 getInstance() {
        return instance;
    }
}
