package com.ogutdeniz.behavioralpatterns.observer.wheatherexample;

public class CurrentConditionsDisplay implements WeatherDataObserver {
    private double temperature;
    private double humidity;
    private double pressure;

    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees, " + humidity + "% humidity, " + pressure + " pressure");
    }
}

