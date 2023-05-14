package com.ogutdeniz.behavioralpatterns.strategy.ecommerceexample;

public class PremiumPricingStrategy implements PricingStrategy {
    public double calculatePrice(Product product) {
        return product.getBasePrice() * 1.2; // 20% premium
    }
}
