package com.ogutdeniz.creationalpatterns.factorymethod.entity;

import com.ogutdeniz.creationalpatterns.factorymethod.PaymentProcessor;

public class BankTransferProcessor implements PaymentProcessor {

    public void validate() {
        System.out.println("BankTransferProcessor validation");
    }

    public void process() {
        System.out.println("BankTransferProcessor process");
    }
}
