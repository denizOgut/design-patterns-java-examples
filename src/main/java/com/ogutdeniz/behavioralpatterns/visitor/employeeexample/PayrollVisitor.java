package com.ogutdeniz.behavioralpatterns.visitor.employeeexample;

public interface PayrollVisitor {
    void visit(FullTimeEmployee employee);
    void visit(PartTimeEmployee employee);
    void visit(Contractor contractor);
}
