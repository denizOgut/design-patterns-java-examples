package com.ogutdeniz.structuralpatterns.adapter.paymentexample;

public class PaymentGatewayAdapter implements CreditCardPaymentProcessor {
    private PaymentGateway paymentGateway;
    private String gatewayName;

    public PaymentGatewayAdapter(PaymentGateway paymentGateway, String gatewayName) {
        this.paymentGateway = paymentGateway;
        this.gatewayName = gatewayName;
    }

    public void processCreditCardPayment(String cardNumber, double amount) {
        paymentGateway.processPayment(gatewayName, cardNumber, amount);
    }
}