package com.ogutdeniz.behavioralpatterns.state.tutorialexample;

public class OffState implements State {
    @Override
    public void turnOn() {
        System.out.println("Turning on the light bulb.");
        // Transition to the OnState
        LightBulb.setState(new OnState());
    }

    @Override
    public void turnOff() {
        System.out.println("The light bulb is already off.");
    }
}
