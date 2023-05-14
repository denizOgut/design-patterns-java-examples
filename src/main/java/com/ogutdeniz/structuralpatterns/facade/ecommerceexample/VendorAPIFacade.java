package com.ogutdeniz.structuralpatterns.facade.ecommerceexample;

public class VendorAPIFacade {

    private VendorA vendorA;
    private VendorB vendorB;

    public VendorAPIFacade() {
        vendorA = new VendorA();
        vendorB = new VendorB();
    }

    public void getProductInfo(String productId) {
        vendorA.fetchProductInfo(productId);
        vendorB.getProductInfo(productId);
    }

    public void placeOrder(String productId, int quantity) {
        vendorA.placeOrder(productId, quantity);
        vendorB.createOrder(productId, quantity);
    }

    public void handlePayment(String orderId, double amount) {
        vendorA.handlePayment(orderId, amount);
        vendorB.processPayment(orderId, amount);
    }
}
