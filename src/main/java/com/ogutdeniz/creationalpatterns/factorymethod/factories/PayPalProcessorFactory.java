package com.ogutdeniz.creationalpatterns.factorymethod.factories;

import com.ogutdeniz.creationalpatterns.factorymethod.entity.PayPalProcessor;
import com.ogutdeniz.creationalpatterns.factorymethod.PaymentProcessor;

public class PayPalProcessorFactory extends PaymentProcessorFactory {
    public PaymentProcessor createProcessor() {
        return new PayPalProcessor();
    }
}
