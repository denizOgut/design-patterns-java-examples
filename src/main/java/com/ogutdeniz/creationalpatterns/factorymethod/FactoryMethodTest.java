package com.ogutdeniz.creationalpatterns.factorymethod;

;
import com.ogutdeniz.creationalpatterns.factorymethod.factories.BankTransferProcessorFactory;
import com.ogutdeniz.creationalpatterns.factorymethod.factories.CreditCardProcessorFactory;
import com.ogutdeniz.creationalpatterns.factorymethod.factories.PayPalProcessorFactory;

public class FactoryMethodTest {
    public static void main(String[] args) {
        BankTransferProcessorFactory bankTransferProcessorFactory = new BankTransferProcessorFactory();
        CreditCardProcessorFactory creditCardProcessorFactory = new CreditCardProcessorFactory();
        PayPalProcessorFactory payPalProcessorFactory = new PayPalProcessorFactory();

        PaymentProcessor bankTransferProcessor = bankTransferProcessorFactory.createProcessor();
        PaymentProcessor creditCardProcessor = creditCardProcessorFactory.createProcessor();
        PaymentProcessor payPalTransferProcessor = payPalProcessorFactory.createProcessor();

        bankTransferProcessor.validate();
        bankTransferProcessor.process();

        creditCardProcessor.validate();
        creditCardProcessor.process();

        payPalTransferProcessor.validate();
        payPalTransferProcessor.process();

    }
}
