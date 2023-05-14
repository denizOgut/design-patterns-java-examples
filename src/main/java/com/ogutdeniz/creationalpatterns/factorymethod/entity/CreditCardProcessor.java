package com.ogutdeniz.creationalpatterns.factorymethod.entity;

import com.ogutdeniz.creationalpatterns.factorymethod.PaymentProcessor;

public class CreditCardProcessor implements PaymentProcessor {
    public void validate() {
        System.out.println("CreditCardProcessor validation");
    }

    public void process() {
        System.out.println("CreditCardProcessor process");
    }
}
