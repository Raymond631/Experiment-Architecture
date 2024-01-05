package com.example.exp03.task5;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        textEditor.addObserver(new Area1());
        textEditor.addObserver(new Area2());
        textEditor.addObserver(new Area3());
        textEditor.textChange();
    }
}
