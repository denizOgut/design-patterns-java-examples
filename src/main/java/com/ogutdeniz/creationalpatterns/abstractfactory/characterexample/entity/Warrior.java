package com.ogutdeniz.creationalpatterns.abstractfactory.characterexample.entity;

import com.ogutdeniz.creationalpatterns.abstractfactory.characterexample.Character;

public class Warrior implements Character {
    private String name;

    public Warrior(String name) {
        this.name = name;
    }

    public void useAbility() {
        System.out.println(name + " swings their sword!");
    }
}
