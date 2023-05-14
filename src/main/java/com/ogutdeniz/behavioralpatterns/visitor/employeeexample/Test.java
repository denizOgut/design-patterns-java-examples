package com.ogutdeniz.behavioralpatterns.visitor.employeeexample;

public class Test {
    public static void main(String[] args) {
        Employee fullTimeEmployee = new FullTimeEmployee("John Doe", 1, 5000.0);
        Employee partTimeEmployee = new PartTimeEmployee("Jane Smith", 2, 15.0, 40);
        Employee contractor = new Contractor("Mike Johnson", 3, 25.0, 20);


        PayrollCalculator payrollCalculator = new PayrollCalculator();


        fullTimeEmployee.accept(payrollCalculator);
        partTimeEmployee.accept(payrollCalculator);
        contractor.accept(payrollCalculator);


        double totalPayroll = payrollCalculator.getTotalPayroll();


        System.out.println("Total payroll: $" + totalPayroll);
    }
}
