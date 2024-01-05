package com.example.exp03.task2;

public class Picture implements Application {
    private Application application;

    public Picture(Application application) {
        this.application = application;
    }

    @Override
    public void run() {
        application.run();
    }
}
