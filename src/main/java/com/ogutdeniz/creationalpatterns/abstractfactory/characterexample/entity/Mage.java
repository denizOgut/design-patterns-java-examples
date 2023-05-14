package com.ogutdeniz.creationalpatterns.abstractfactory.characterexample.entity;

import com.ogutdeniz.creationalpatterns.abstractfactory.characterexample.Character;

public class Mage implements Character {
    private String name;

    public Mage(String name) {
        this.name = name;
    }

    public void useAbility() {
        System.out.println(name + " casts a fireball!");
    }
}
