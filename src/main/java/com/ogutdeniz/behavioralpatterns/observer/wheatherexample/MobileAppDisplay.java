package com.ogutdeniz.behavioralpatterns.observer.wheatherexample;

public class MobileAppDisplay implements WeatherDataObserver {
    private double temperature;

    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        display();
    }

    public void display() {
        System.out.println("Current temperature: " + temperature + "F degrees");
    }
}
