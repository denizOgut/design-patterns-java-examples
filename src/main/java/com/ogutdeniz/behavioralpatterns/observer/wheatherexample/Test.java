package com.ogutdeniz.behavioralpatterns.observer.wheatherexample;

public class Test {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        MobileAppDisplay mobileDisplay = new MobileAppDisplay();

        weatherData.registerObserver(currentDisplay);
        weatherData.registerObserver(mobileDisplay);

        weatherData.setMeasurements(25.0, 70.0, 1013.25);
    }
}
