package com.example.task5;

public class SceneFactoryB implements SceneFactory{
    @Override
    public Map createMap() {
        return new MapB();
    }

    @Override
    public Weather createWeather() {
        return new WeatherB();
    }

    @Override
    public Sound createSound() {
        return new SoundB();
    }
}
