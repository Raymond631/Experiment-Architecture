package com.example.exp03.task5;

public class Area2 implements Observer {
    @Override
    public void onTextChanged() {
        System.out.println("统计出现的单词（去重后按照字典序排序）");
    }
}
