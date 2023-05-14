package com.ogutdeniz.creationalpatterns.factorymethod.factories;

import com.ogutdeniz.creationalpatterns.factorymethod.entity.BankTransferProcessor;
import com.ogutdeniz.creationalpatterns.factorymethod.PaymentProcessor;

public class BankTransferProcessorFactory extends PaymentProcessorFactory {
    public PaymentProcessor createProcessor() {
        return new BankTransferProcessor();
    }
}
