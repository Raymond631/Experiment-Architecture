package com.example.exp03.task7;

public class Photograph {
    // 默认策略
    private FilterStrategy strategy = new BlackWhiteFilter();

    // 更换策略
    public void setStrategy(FilterStrategy strategy) {
        this.strategy = strategy;
    }

    public void filter() {
        this.strategy.filter();
    }
}
