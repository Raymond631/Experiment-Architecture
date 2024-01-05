package com.example.exp03.task6;

import java.util.ArrayList;
import java.util.List;

public class Thermosensor {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void warning() {
        observers.forEach(Observer::highTemp);
    }
}
