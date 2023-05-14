package com.ogutdeniz.behavioralpatterns.observer.tutorialexample;

public interface Subject {
    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();
}

