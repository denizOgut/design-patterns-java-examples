package com.ogutdeniz.behavioralpatterns.strategy.shippingexample;

public class FreeShipping implements ShippingStrategy {
    public double calculate(double weight) {
        return 0.0; // free shipping
    }
}
