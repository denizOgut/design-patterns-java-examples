package com.ogutdeniz.behavioralpatterns.visitor.shapeexample;

public interface Shape {
    void accept(ShapeVisitor visitor);
}
