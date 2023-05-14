package com.ogutdeniz.structuralpatterns.adapter.paymentexample;

public class PaymentGateway {
    public void processPayment(String gatewayName, String cardNumber, double amount) {
        System.out.println("Processing " + gatewayName + " payment of $" + amount + " with card number " + cardNumber);
    }
}
