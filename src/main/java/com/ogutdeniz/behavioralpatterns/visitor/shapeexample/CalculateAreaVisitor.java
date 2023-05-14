package com.ogutdeniz.behavioralpatterns.visitor.shapeexample;

public class CalculateAreaVisitor implements ShapeVisitor {
    private double totalArea;

    public CalculateAreaVisitor() {
        totalArea = 0.0;
    }

    public double getTotalArea() {
        return totalArea;
    }

    @Override
    public void visitCircle(Circle circle) {
        double area = Math.PI * circle.getRadius() * circle.getRadius();
        totalArea += area;
    }

    @Override
    public void visitSquare(Square square) {
        double area = square.getSide() * square.getSide();
        totalArea += area;
    }

    @Override
    public void visitTriangle(Triangle triangle) {
        double area = 0.5 * triangle.getBase() * triangle.getHeight();
        totalArea += area;
    }
}
