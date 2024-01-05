package com.example.exp03.task4;

public class LightCommand implements Command {
    private Light light;

    public LightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        if (light.status){
            light.turnOff();
        }else{
            light.turnOn();
        }
    }
}
