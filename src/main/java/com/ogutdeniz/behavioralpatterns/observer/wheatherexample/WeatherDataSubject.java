package com.ogutdeniz.behavioralpatterns.observer.wheatherexample;

public interface WeatherDataSubject {
    public void registerObserver(WeatherDataObserver observer);
    public void removeObserver(WeatherDataObserver observer);
    public void notifyObservers();
}
