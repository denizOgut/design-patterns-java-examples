package com.ogutdeniz.behavioralpatterns.visitor.employeeexample;

public class PayrollCalculator implements PayrollVisitor {
    private double totalPayroll;

    public PayrollCalculator() {
        totalPayroll = 0.0;
    }

    public double getTotalPayroll() {
        return totalPayroll;
    }

    @Override
    public void visit(FullTimeEmployee employee) {
        totalPayroll += employee.calculatePay();
    }

    @Override
    public void visit(PartTimeEmployee employee) {
        totalPayroll += employee.calculatePay();
    }

    @Override
    public void visit(Contractor contractor) {
        totalPayroll += contractor.calculatePay();
    }
}
