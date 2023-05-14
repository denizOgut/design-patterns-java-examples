package com.ogutdeniz.behavioralpatterns.memento.bankaccountexample;

import java.util.Stack;

public class BankAccount {
    private int balance;
    private Stack<Memento> undoStack;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
        this.undoStack = new Stack<>();
    }

    public void transfer(int amount, BankAccount recipient) {
        if (this.balance >= amount) {
            this.balance -= amount;
            recipient.deposit(amount);
            System.out.println("$" + amount + " transferred from Account #" + this.hashCode() + " to Account #" + recipient.hashCode() + ".");
            this.saveState();
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void deposit(int amount) {
        this.balance += amount;
        System.out.println("$" + amount + " deposited into Account #" + this.hashCode() + ".");
        this.saveState();
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            Memento memento = undoStack.pop();
            this.balance = memento.getSavedBalance();
            System.out.println("Undo completed. Account #" + this.hashCode() + " balance restored to $" + this.balance + ".");
        } else {
            System.out.println("Nothing to undo.");
        }
    }

    private void saveState() {
        undoStack.push(new Memento(this.balance));
    }
}