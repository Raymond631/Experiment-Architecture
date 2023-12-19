package com.example.task5;

public class SceneFactoryA implements SceneFactory{
    @Override
    public Map createMap() {
        return new MapA();
    }

    @Override
    public Weather createWeather() {
        return new WeatherA();
    }

    @Override
    public Sound createSound() {
        return new SoundA();
    }
}
