package com.ogutdeniz.structuralpatterns.proxy.pizzaexample;

public class Test {
    public static void main(String[] args) {
        Pizza pizza = new PizzaProxy();
        pizza.orderPizza();
    }
}
