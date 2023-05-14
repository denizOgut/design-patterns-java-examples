package com.ogutdeniz.behavioralpatterns.state.vendingmachineexample;

public class ReadyState implements VendingMachineState {
    private VendingMachine vendingMachine;

    public ReadyState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectBeverage(String beverage) {
        vendingMachine.setSelectedBeverage(beverage);
        vendingMachine.setState(vendingMachine.getPaymentState());
    }

    @Override
    public void insertCoin(double amount) {
        System.out.println("Please select a beverage first");
    }

    @Override
    public void dispenseBeverage() {
        System.out.println("Please select a beverage and make a payment first");
    }
}

