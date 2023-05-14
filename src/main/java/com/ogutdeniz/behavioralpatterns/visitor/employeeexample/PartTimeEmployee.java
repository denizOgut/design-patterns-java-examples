package com.ogutdeniz.behavioralpatterns.visitor.employeeexample;

public class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
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
        return hourlyRate * hoursWorked;
    }
}
