package com.ogutdeniz.structuralpatterns.composite.productexample;

public class Test {
    public static void main(String[] args) {
        SimpleProduct backpack = new SimpleProduct("Backpack", 50.0);
        SimpleProduct notebook = new SimpleProduct("Notebook", 5.0);
        SimpleProduct pen = new SimpleProduct("Pen", 1.0);

        CompositeProduct backToSchoolBundle = new CompositeProduct("Back to School Bundle");
        backToSchoolBundle.addProduct(backpack);
        backToSchoolBundle.addProduct(notebook);
        backToSchoolBundle.addProduct(pen);

        System.out.println("The Back to School bundle costs $" + backToSchoolBundle.getPrice());
    }
}
