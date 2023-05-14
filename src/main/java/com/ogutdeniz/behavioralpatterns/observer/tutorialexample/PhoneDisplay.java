package com.ogutdeniz.behavioralpatterns.observer.tutorialexample;

public class PhoneDisplay implements Observer {
    private double temperature;

    public void update() {
        display();
    }

    public void display() {
        System.out.println("Phone Display: " + temperature + " degrees");
    }
}
