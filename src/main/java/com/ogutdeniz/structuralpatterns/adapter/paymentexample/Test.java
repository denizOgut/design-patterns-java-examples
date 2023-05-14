package com.ogutdeniz.structuralpatterns.adapter.paymentexample;

public class Test {
    public static void main(String[] args) {

        /*
            The PaymentGatewayAdapter class adapts the data returned by the PaymentGateway to the format expected by our application's CreditCardPaymentProcessor interface.
            The adapter's constructor takes a PaymentGateway object and the gateway name as parameters and saves them as instance variables.
            Then, the adapter's processCreditCardPayment() method calls the processPayment() method of the PaymentGateway object, passing the gateway name, card number, and amount in the appropriate format expected by the third-party service.
        */

        PaymentGatewayAdapter paymentGatewayAdapter = new PaymentGatewayAdapter(new PaymentGateway(), "Stripe");
        paymentGatewayAdapter.processCreditCardPayment("1234567890123456", 99.99);
    }
}
