package com.ogutdeniz.creationalpatterns.factorymethod.factories;

import com.ogutdeniz.creationalpatterns.factorymethod.PaymentProcessor;

public abstract class PaymentProcessorFactory {
    public abstract PaymentProcessor createProcessor();
}
