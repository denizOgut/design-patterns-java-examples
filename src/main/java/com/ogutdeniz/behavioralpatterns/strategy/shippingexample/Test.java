package com.ogutdeniz.behavioralpatterns.strategy.shippingexample;

public class Test {
    public static void main(String[] args) {
        ShippingCalculator calculator = new ShippingCalculator(new StandardShipping());
        double cost = calculator.calculateShippingCost(10.0); // $5.00

        calculator = new ShippingCalculator(new ExpeditedShipping());
        cost = calculator.calculateShippingCost(10.0); // $15.00

        calculator = new ShippingCalculator(new FreeShipping());
        cost = calculator.calculateShippingCost(10.0); // $0.00
    }
}
