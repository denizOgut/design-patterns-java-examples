package com.ogutdeniz.behavioralpatterns.strategy.ecommerceexample;

public class DiscountPricingStrategy implements PricingStrategy {
    public double calculatePrice(Product product) {
        return product.getBasePrice() * 0.8; // 20% discount
    }
}
