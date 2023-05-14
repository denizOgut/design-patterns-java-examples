package com.ogutdeniz.behavioralpatterns.templatemethod.gameexample;

public class PlayerCharacter extends Character {
    private int currentPosition = 0;

    @Override
    protected int getCurrentPosition() {
        return currentPosition;
    }

    @Override
    protected int calculateNewPosition(int currentPosition) {
        return currentPosition + 1;
    }

    @Override
    protected void moveTo(int newPosition) {
        System.out.println("Moving player character to position " + newPosition);
        currentPosition = newPosition;
    }
}
