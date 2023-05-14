package com.ogutdeniz.behavioralpatterns.state.tutorialexample;

public class OnState implements State {
    @Override
    public void turnOn() {
        System.out.println("The light bulb is already on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the light bulb.");
        // Transition to the OffState
        LightBulb.setState(new OffState());
    }
}

