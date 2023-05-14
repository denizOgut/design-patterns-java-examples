package com.ogutdeniz.behavioralpatterns.observer.tutorialexample;

public class Test {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        PhoneDisplay phoneDisplay = new PhoneDisplay();

        weatherStation.addObserver(phoneDisplay);

        weatherStation.setTemperature(75.0);
    }
}
