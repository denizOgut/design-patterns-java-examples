package com.ogutdeniz.structuralpatterns.facade.tutorialexample;

public class Facade {
    private ComplexClassA complexClassA;
    private ComplexClassB complexClassB;
    private ComplexClassC complexClassC;

    public Facade() {
        complexClassA = new ComplexClassA();
        complexClassB = new ComplexClassB();
        complexClassC = new ComplexClassC();
    }

    public void doSomething() {
        complexClassA.methodA();
        complexClassB.methodB();
        complexClassC.methodC();
    }
}