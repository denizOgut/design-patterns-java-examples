package com.ogutdeniz.structuralpatterns.composite.productexample;

import java.util.ArrayList;
import java.util.List;

public class CompositeProduct implements Product {
    private String name;
    private List<Product> products = new ArrayList<>();

    public CompositeProduct(String name) {
        this.name = name;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double getPrice() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}
