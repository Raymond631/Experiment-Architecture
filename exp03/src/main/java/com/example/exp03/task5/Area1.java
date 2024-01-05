package com.example.exp03.task5;

public class Area1 implements Observer {
    @Override
    public void onTextChanged() {
        System.out.println("统计出现的单词总数量和字符总数量");
    }
}
