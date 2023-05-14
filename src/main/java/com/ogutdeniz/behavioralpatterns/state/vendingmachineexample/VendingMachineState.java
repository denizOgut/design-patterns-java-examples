package com.ogutdeniz.behavioralpatterns.state.vendingmachineexample;

interface VendingMachineState {
    void selectBeverage(String beverage);
    void insertCoin(double amount);
    void dispenseBeverage();
}

