package com.ogutdeniz.behavioralpatterns.visitor.shapeexample;

public interface ShapeVisitor {
    void visitCircle(Circle circle);
    void visitSquare(Square square);
    void visitTriangle(Triangle triangle);
}
