package com.ogutdeniz.structuralpatterns.proxy.pizzaexample;

public class PizzaProxy implements Pizza {
    private Pizza realPizza;

    public PizzaProxy() {
        this.realPizza = new RealPizza();
    }

    public void orderPizza() {
        System.out.println("Taking pizza order...");
        realPizza.orderPizza();
        System.out.println("Pizza is on its way!");
    }
}
