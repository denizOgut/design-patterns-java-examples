package com.ogutdeniz.behavioralpatterns.visitor.shapeexample;

public class Test {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape square = new Square(4.0);
        Shape triangle = new Triangle(3.0, 6.0);


        CalculateAreaVisitor areaVisitor = new CalculateAreaVisitor();



        circle.accept(areaVisitor);
        square.accept(areaVisitor);
        triangle.accept(areaVisitor);


        double totalArea = areaVisitor.getTotalArea();


        System.out.println("Total area: " + totalArea);
    }
}
