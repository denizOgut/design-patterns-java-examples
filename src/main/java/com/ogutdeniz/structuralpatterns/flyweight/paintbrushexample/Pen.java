package com.ogutdeniz.structuralpatterns.flyweight.paintbrushexample;

public interface Pen {
    public void setColor(String color);

    public void draw(String content);
}