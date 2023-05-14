package com.ogutdeniz.behavioralpatterns.strategy.shippingexample;

public class ExpeditedShipping implements ShippingStrategy {
    public double calculate(double weight) {
        return weight * 1.5; // $1.50 per pound
    }
}
