package com.ogutdeniz.creationalpatterns.factorymethod.entity;

import com.ogutdeniz.creationalpatterns.factorymethod.PaymentProcessor;

public class PayPalProcessor implements PaymentProcessor {
    public void validate() {
        System.out.println("PayPalProcessor validation");
    }

    public void process() {
        System.out.println("PayPalProcessor process");
    }
}
