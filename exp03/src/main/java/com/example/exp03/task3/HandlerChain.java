package com.example.exp03.task3;

import java.util.ArrayList;
import java.util.List;

public class HandlerChain {
    private List<Handler> handlers;

    public HandlerChain() {
        handlers = new ArrayList<>();
    }

    public void addHandler(Handler handler) {
        handlers.add(handler);
    }

    public void filter(Request request) {
        for (Handler handler : handlers) {
            handler.filter(request);
        }
    }
}
