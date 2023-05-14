package com.ogutdeniz.behavioralpatterns.state.vendingmachineexample;

public class PaymentState implements VendingMachineState {
    private VendingMachine vendingMachine;

    public PaymentState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectBeverage(String beverage) {
        System.out.println("You have already selected a beverage");
    }

    @Override
    public void insertCoin(double amount) {
        double total = vendingMachine.getTotalAmount() + amount;
        vendingMachine.setTotalAmount(total);

        if (total >= vendingMachine.getPrice()) {
            vendingMachine.setState(vendingMachine.getDispenseState());
        }
    }

    @Override
    public void dispenseBeverage() {
        System.out.println("Please insert coins first");
    }
}
