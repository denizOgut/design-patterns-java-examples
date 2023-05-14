package com.ogutdeniz.behavioralpatterns.state.vendingmachineexample;

class VendingMachine {
    private VendingMachineState currentState;
    private String selectedBeverage;
    private double totalAmount;
    private final double price;

    public VendingMachine(double price) {
        currentState = new ReadyState(this);
        selectedBeverage = null;
        totalAmount = 0;
        this.price = price;
    }

    public void setState(VendingMachineState state) {
        currentState = state;
    }

    public void selectBeverage(String beverage) {
        currentState.selectBeverage(beverage);
    }

    public void insertCoin(double amount) {
        currentState.insertCoin(amount);
    }

    public void dispenseBeverage() {
        currentState.dispenseBeverage();
    }

    public String getSelectedBeverage() {
        return selectedBeverage;
    }

    public void setSelectedBeverage(String selectedBeverage) {
        this.selectedBeverage = selectedBeverage;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getPrice() {
        return price;
    }

    public VendingMachineState getReadyState() {
        return new ReadyState(this);
    }

    public VendingMachineState getPaymentState() {
        return new PaymentState(this);
    }

    public VendingMachineState getDispenseState() {
        return new DispenseState(this);
    }
}
