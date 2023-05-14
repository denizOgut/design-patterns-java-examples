package com.ogutdeniz.behavioralpatterns.templatemethod.gameexample;

public abstract class Character {

    public final void move() {
        // Step 1: Get the current position
        int currentPosition = getCurrentPosition();

        // Step 2: Calculate the new position
        int newPosition = calculateNewPosition(currentPosition);

        // Step 3: Move to the new position
        moveTo(newPosition);
    }

    protected abstract int getCurrentPosition();

    protected abstract int calculateNewPosition(int currentPosition);

    protected abstract void moveTo(int newPosition);
}

