package com.example.task10;

import java.util.ArrayList;
import java.util.List;

public class Group implements Component{
    private String name;
    private List<Component> members;

    public Group(String name) {
        this.name = name;
        this.members = new ArrayList<>();
    }

    public void add(Component component){
        // 既可以加Member，也可以加Group
        members.add(component);
    }

    @Override
    public void share(){
        for (Component component : members) {
            // 如果component是Member,则调用Member的share方法，直接分享
            // 如果component还是Group,则调用Group的share方法，遍历子对象（有点像递归）
            component.share();
        }
    }
}
