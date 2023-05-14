package com.ogutdeniz.structuralpatterns.flyweight.ecommerceexample;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class EcommerceWebsite {
    private List<Product> products = new ArrayList<>(); // This is the unique information (extrinsic state)

    public void displayProducts(String manufacturer) {
        ProductFactory factory = new ProductFactory();
        Product product1 = factory.getProduct("Product 1", new BigDecimal("10.00"), "Description 1", manufacturer);
        products.add(product1); // Add the unique information (extrinsic state)
        Product product2 = factory.getProduct("Product 2", new BigDecimal("20.00"), "Description 2", manufacturer);
        products.add(product2); // Add the unique information (extrinsic state)
        // ... display the products on the website
    }

    public List<Product> getProducts() {
        return products;
    }
}