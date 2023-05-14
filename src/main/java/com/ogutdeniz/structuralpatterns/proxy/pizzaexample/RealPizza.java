package com.ogutdeniz.structuralpatterns.proxy.pizzaexample;

public class RealPizza implements Pizza {
    public void orderPizza() {
        System.out.println("Ordering pizza...");
    }
}
