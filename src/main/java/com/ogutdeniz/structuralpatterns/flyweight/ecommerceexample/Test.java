package com.ogutdeniz.structuralpatterns.flyweight.ecommerceexample;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        EcommerceWebsite website = new EcommerceWebsite();
        website.displayProducts("Manufacturer A");

        List<Product> products = website.getProducts();
        for (Product product : products) {
            System.out.println("Name: " + product.getName());
            System.out.println("Price: " + product.getPrice());
            System.out.println("Description: " + product.getDescription());
            System.out.println("Manufacturer: " + product.getManufacturer());
            System.out.println("-----------------------------------");
        }
    }
}
