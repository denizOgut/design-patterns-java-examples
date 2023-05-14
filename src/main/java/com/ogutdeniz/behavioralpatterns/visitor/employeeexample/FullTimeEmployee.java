package com.ogutdeniz.behavioralpatterns.visitor.employeeexample;

public class FullTimeEmployee extends Employee {
    private double salary;

    public FullTimeEmployee(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void accept(PayrollVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public double calculatePay() {
        return salary;
    }
}


