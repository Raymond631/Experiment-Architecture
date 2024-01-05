package com.example.exp03.task5;

public class Area3 implements Observer {
    @Override
    public void onTextChanged() {
        System.out.println("统计出现的单词以及每个单词出现的次数,于按照出现频次降序显示");
    }
}
