package com.ogutdeniz.structuralpatterns.facade.ecommerceexample;

public class VendorA {
    public void fetchProductInfo(String productId) {
        System.out.println("Vendor A productId" + productId);
    }

    public void placeOrder(String productId, int quantity) {
        System.out.println("Vendor A placeOrder" + productId + " amount " +quantity);
    }

    public void handlePayment(String orderId, double amount) {
        // handle payment on Vendor A's API
    }
}

// Creating Facade Class

