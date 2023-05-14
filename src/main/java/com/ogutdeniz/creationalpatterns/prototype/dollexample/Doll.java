package com.ogutdeniz.creationalpatterns.prototype.dollexample;

public class Doll implements Cloneable {
    private String color;

    public Doll(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public Doll copy() throws CloneNotSupportedException {
        return (Doll) super.clone();
    }
}
