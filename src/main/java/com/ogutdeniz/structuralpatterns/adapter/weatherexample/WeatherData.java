package com.ogutdeniz.structuralpatterns.adapter.weatherexample;

public interface WeatherData {
    public String getLocation();

    public double getTemperature();

    public double getHumidity();
}
