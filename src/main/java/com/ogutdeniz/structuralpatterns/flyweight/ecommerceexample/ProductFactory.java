package com.ogutdeniz.structuralpatterns.flyweight.ecommerceexample;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class ProductFactory {
    private Map<String, Product> products = new HashMap<>(); // This is the shared information (intrinsic state)

    public Product getProduct(String name, BigDecimal price, String description, String manufacturer) {
        String key = manufacturer + name + price + description;
        if (!products.containsKey(key)) {
            products.put(key, new Product(name, price, description, manufacturer));
        }
        return products.get(key);
    }
}
