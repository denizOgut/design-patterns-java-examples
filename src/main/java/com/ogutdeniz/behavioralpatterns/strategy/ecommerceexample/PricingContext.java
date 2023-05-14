package com.ogutdeniz.behavioralpatterns.strategy.ecommerceexample;

public class PricingContext {
    private PricingStrategy pricingStrategy;

    public PricingContext(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public double calculatePrice(Product product) {
        return pricingStrategy.calculatePrice(product);
    }
}
