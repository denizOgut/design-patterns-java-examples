package com.ogutdeniz.creationalpatterns.factorymethod.factories;

import com.ogutdeniz.creationalpatterns.factorymethod.entity.CreditCardProcessor;
import com.ogutdeniz.creationalpatterns.factorymethod.PaymentProcessor;

public class CreditCardProcessorFactory extends PaymentProcessorFactory {
    public PaymentProcessor createProcessor() {
        return new CreditCardProcessor();
    }
}
