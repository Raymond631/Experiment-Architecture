package com.example.task7;

// IoDH方式单例模式
public class VirtualUserGenerator3 {

    private VirtualUserGenerator3() {
        // 私有构造方法，防止外部实例化
    }

    private static class Holder {
        private static final VirtualUserGenerator3 instance = new VirtualUserGenerator3();
    }

    public static VirtualUserGenerator3 getInstance() {
        return Holder.instance;
    }
}

