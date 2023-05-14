package com.ogutdeniz.behavioralpatterns.memento.bankaccountexample;

public class Memento {
    private int savedBalance;

    public Memento(int balance) {
        this.savedBalance = balance;
    }

    public int getSavedBalance() {
        return savedBalance;
    }
}
