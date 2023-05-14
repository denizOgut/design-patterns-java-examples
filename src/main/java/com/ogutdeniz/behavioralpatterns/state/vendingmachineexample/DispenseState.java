package com.ogutdeniz.behavioralpatterns.state.vendingmachineexample;

public class DispenseState implements VendingMachineState {
    private VendingMachine vendingMachine;

    public DispenseState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectBeverage(String beverage) {
        System.out.println("Please wait for your beverage to be dispensed");
    }

    @Override
    public void insertCoin(double amount) {
        System.out.println("Payment has already been made");
    }

    @Override
    public void dispenseBeverage() {
        System.out.println("Dispensing " + vendingMachine.getSelectedBeverage());
        vendingMachine.setTotalAmount(0);
        vendingMachine.setState(vendingMachine.getReadyState());
    }
}
