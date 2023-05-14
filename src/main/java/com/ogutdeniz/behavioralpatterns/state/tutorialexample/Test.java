package com.ogutdeniz.behavioralpatterns.state.tutorialexample;

public class Test {
    public static void main(String[] args) {
        LightBulb bulb = new LightBulb();

        bulb.turnOn(); // Turns on the light bulb
        bulb.turnOn(); // Prints "The light bulb is already on."
        bulb.turnOff(); // Turns off the light bulb
        bulb.turnOff(); // Prints "The light bulb is already off."
        bulb.turnOn(); // Turns on the light bulb again
    }
}
