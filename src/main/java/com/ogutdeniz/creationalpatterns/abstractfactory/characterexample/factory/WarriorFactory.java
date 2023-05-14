package com.ogutdeniz.creationalpatterns.abstractfactory.characterexample.factory;

import com.ogutdeniz.creationalpatterns.abstractfactory.characterexample.Character;
import com.ogutdeniz.creationalpatterns.abstractfactory.characterexample.CharacterFactory;
import com.ogutdeniz.creationalpatterns.abstractfactory.characterexample.entity.Warrior;

public class WarriorFactory implements CharacterFactory {
    @Override
    public Character createCharacter(String name) {
        return new Warrior(name);
    }
}
