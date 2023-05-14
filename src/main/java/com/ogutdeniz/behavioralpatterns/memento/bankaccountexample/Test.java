package com.ogutdeniz.behavioralpatterns.memento.bankaccountexample;

public class Test {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(100);
        BankAccount account2 = new BankAccount(0);

        account1.transfer(50, account2);
        account1.transfer(75, account2);
        account1.deposit(25);

        account1.undo(); // Undo deposit
        account1.undo(); // Undo transfer
        account1.undo(); // Nothing to undo
    }
}
