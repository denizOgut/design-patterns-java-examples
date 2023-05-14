package com.ogutdeniz.structuralpatterns.facade.ecommerceexample;

public class VendorB {
    public void getProductInfo(String id) {
        System.out.println("Vendor B productId" + id);
    }

    public void createOrder(String id, int quantity) {
        System.out.println("Vendor A placeOrder" + id + " amount " + quantity);
    }

    public void processPayment(String orderId, double amount) {
        System.out.println("Vendor B proccessing payment for: " + orderId + " withdrawing: " + amount);
    }
}
