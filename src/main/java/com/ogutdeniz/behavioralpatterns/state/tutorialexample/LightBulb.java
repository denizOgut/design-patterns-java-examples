package com.ogutdeniz.behavioralpatterns.state.tutorialexample;

public class LightBulb {
    private static State currentState;

    public LightBulb() {
        // Initial state is off
        currentState = new OffState();
    }

    public static void setState(State state) {
        currentState = state;
    }

    public void turnOn() {
        currentState.turnOn();
    }

    public void turnOff() {
        currentState.turnOff();
    }
}