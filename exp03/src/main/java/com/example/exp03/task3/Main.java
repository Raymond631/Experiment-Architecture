package com.example.exp03.task3;

public class Main {
    public static void main(String[] args) {
        Request request = new Request();
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new EncodeHandler());
        chain.addHandler(new TypeHandler());
        chain.addHandler(new ValidateHandler());
        chain.filter(request);
    }
}
