package com.ogutdeniz.behavioralpatterns.strategy.shippingexample;

public class StandardShipping implements ShippingStrategy {
    public double calculate(double weight) {
        return weight * 0.5; // $0.50 per pound
    }
}

