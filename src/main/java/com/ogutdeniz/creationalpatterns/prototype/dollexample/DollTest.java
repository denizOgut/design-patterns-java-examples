package com.ogutdeniz.creationalpatterns.prototype.dollexample;

public class DollTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Doll originalDoll = new Doll("blue");
        Doll newDoll = originalDoll.copy();

        originalDoll.setColor("red");
        System.out.println(originalDoll.getColor());
        System.out.println(newDoll.getColor());
    }
}
