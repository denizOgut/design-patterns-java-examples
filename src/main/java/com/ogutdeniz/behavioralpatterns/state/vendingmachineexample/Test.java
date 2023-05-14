package com.ogutdeniz.behavioralpatterns.state.vendingmachineexample;

public class Test {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(2.5);

        vendingMachine.selectBeverage("Coffee");
        vendingMachine.insertCoin(1.0);
        vendingMachine.insertCoin(1.5);
        vendingMachine.dispenseBeverage();

        vendingMachine.selectBeverage("Tea");
        vendingMachine.insertCoin(1.0);
        vendingMachine.dispenseBeverage();
    }
}
