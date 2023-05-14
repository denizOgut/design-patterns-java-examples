package com.ogutdeniz.structuralpatterns.composite.productexample;

import java.util.ArrayList;
import java.util.List;

public class SimpleProduct implements Product {
    private String name;
    private double price;

    public SimpleProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

