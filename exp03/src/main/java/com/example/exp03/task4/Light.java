package com.example.exp03.task4;

public class Light {
    private String room;
    private boolean status;

    public Light(String room) {
        this.room = room;
    }

    public void turnOn() {
        this.status = true;
    }

    public void turnOff() {
        this.status = false;
    }
}
