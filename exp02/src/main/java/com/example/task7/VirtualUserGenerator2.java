package com.example.task7;

// 双重检测锁单例模式
public class VirtualUserGenerator2 {
    private static volatile VirtualUserGenerator2 instance;

    private VirtualUserGenerator2() {
        // 私有构造方法，防止外部实例化
    }

    public static VirtualUserGenerator2 getInstance() {
        if (instance == null) {
            synchronized (VirtualUserGenerator2.class) {
                if (instance == null) {
                    instance = new VirtualUserGenerator2();
                }
            }
        }
        return instance;
    }
}
