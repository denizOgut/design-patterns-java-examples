package com.ogutdeniz.behavioralpatterns.chainofresponsibility.helpdeskexample;

public class SupportHandlerFactory {
    public static SupportHandler createSupportChain() {
        SupportHandler salesSupport = new SalesSupportHandler("Sales");
        SupportHandler technicalSupport = new TechnicalSupportHandler("Technical");
        SupportHandler generalSupport = new GeneralSupportHandler();

        salesSupport.setNextHandler(technicalSupport);
        technicalSupport.setNextHandler(generalSupport);

        return salesSupport;
    }
}
