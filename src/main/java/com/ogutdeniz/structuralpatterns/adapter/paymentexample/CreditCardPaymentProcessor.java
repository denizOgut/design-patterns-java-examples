package com.ogutdeniz.structuralpatterns.adapter.paymentexample;

public interface CreditCardPaymentProcessor {
    public void processCreditCardPayment(String cardNumber, double amount);
}
