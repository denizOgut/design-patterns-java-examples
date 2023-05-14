package com.ogutdeniz.structuralpatterns.adapter.weatherexample;

public class WeatherDataAdapter implements WeatherData {
    private WeatherService weatherService;

    public WeatherDataAdapter(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    public String getLocation() {
        String weatherData = weatherService.getWeatherData();
        String[] parts = weatherData.split(",");
        return parts[0];
    }

    public double getTemperature() {
        String weatherData = weatherService.getWeatherData();
        String[] parts = weatherData.split(",");
        return Double.parseDouble(parts[1]);
    }

    public double getHumidity() {
        String weatherData = weatherService.getWeatherData();
        String[] parts = weatherData.split(",");
        return Double.parseDouble(parts[2]);
    }
}