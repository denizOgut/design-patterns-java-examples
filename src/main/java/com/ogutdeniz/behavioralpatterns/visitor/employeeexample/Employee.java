package com.ogutdeniz.behavioralpatterns.visitor.employeeexample;

public abstract class Employee {
    protected String name;
    protected int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract void accept(PayrollVisitor visitor);

    public abstract double calculatePay();
}
