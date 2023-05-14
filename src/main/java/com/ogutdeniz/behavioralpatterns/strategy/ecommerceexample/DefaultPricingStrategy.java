package com.ogutdeniz.behavioralpatterns.strategy.ecommerceexample;

public class DefaultPricingStrategy implements PricingStrategy {
    public double calculatePrice(Product product) {
        return product.getBasePrice();
    }
}

