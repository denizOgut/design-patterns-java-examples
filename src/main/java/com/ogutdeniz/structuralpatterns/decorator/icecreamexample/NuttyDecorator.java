package com.ogutdeniz.structuralpatterns.decorator.icecreamexample;

public class NuttyDecorator extends IcecreamDecorator {
    public NuttyDecorator(Icecream specialIcecream) {
        super(specialIcecream);
    }

    public String makeIcecream() {
        return specialIcecream.makeIcecream() + addNuts();
    }

    private String addNuts() {
        return " + crunchy nuts";
    }
}
