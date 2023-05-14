package com.ogutdeniz.structuralpatterns.decorator.icecreamexample;

public class TestDecorator {
    public static void main(String args[]) {
        Icecream icecream = new HoneyDecorator(new NuttyDecorator(new SimpleIcecream()));
        System.out.println(icecream.makeIcecream());
    }
}
