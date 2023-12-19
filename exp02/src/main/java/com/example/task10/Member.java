package com.example.task10;

public class Member implements Component{
    private String name;

    public Member(String name){
        this.name = name;
    }

    @Override
    public void share() {
        System.out.println("share to "+name);
    }
}
