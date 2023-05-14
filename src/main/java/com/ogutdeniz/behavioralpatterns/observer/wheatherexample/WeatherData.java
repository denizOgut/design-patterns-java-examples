package com.ogutdeniz.behavioralpatterns.observer.wheatherexample;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements WeatherDataSubject {
    private List<WeatherDataObserver> observers;
    private double temperature;
    private double humidity;
    private double pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void registerObserver(WeatherDataObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(WeatherDataObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (WeatherDataObserver observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurements(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }
}
