package com.example.exp03.task5;

import java.util.ArrayList;
import java.util.List;

public class TextEditor {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void textChange() {
        observers.forEach(Observer::onTextChanged);
    }
}
