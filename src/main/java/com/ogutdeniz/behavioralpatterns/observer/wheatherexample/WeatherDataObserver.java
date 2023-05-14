package com.ogutdeniz.behavioralpatterns.observer.wheatherexample;

public interface WeatherDataObserver {
    public void update(double temperature, double humidity, double pressure);
}
