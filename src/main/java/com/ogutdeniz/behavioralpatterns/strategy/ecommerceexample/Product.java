package com.ogutdeniz.behavioralpatterns.strategy.ecommerceexample;

public class Product {
    private String name;
    private double basePrice;

    public Product(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public double calculatePrice(PricingContext pricingContext) {
        return pricingContext.calculatePrice(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    // getters and setters
}
