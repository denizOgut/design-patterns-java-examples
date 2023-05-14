package com.ogutdeniz.behavioralpatterns.strategy.ecommerceexample;

public class Test {
    public static void main(String[] args) {
        PricingContext defaultContext = new PricingContext(new DefaultPricingStrategy());
        PricingContext discountContext = new PricingContext(new DiscountPricingStrategy());
        PricingContext premiumContext = new PricingContext(new PremiumPricingStrategy());

        Product book = new Product("Book", 10.0);
        Product laptop = new Product("Laptop", 500.0);
        Product shirt = new Product("Shirt", 20.0);

        double bookPrice = book.calculatePrice(defaultContext); // $10.0
        double laptopPrice = laptop.calculatePrice(discountContext); // $400.0 (20% discount)
        double shirtPrice = shirt.calculatePrice(premiumContext); // $24.0 (20% premium)
    }
}
