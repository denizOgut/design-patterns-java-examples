package com.ogutdeniz.behavioralpatterns.visitor.employeeexample;

public class Contractor extends Employee {
    private double rate;
    private int hoursWorked;

    public Contractor(String name, int id, double rate, int hoursWorked) {
        super(name, id);
        this.rate = rate;
        this.hoursWorked = hoursWorked;
    }

    public double getRate() {
        return rate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public void accept(PayrollVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public double calculatePay() {
        return rate * hoursWorked;
    }
}
