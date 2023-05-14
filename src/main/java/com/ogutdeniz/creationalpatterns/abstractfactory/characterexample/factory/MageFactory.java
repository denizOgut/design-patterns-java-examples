package com.ogutdeniz.creationalpatterns.abstractfactory.characterexample.factory;

import com.ogutdeniz.creationalpatterns.abstractfactory.characterexample.Character;
import com.ogutdeniz.creationalpatterns.abstractfactory.characterexample.CharacterFactory;
import com.ogutdeniz.creationalpatterns.abstractfactory.characterexample.entity.Mage;

public class MageFactory implements CharacterFactory {
    @Override
    public Character createCharacter(String name) {
        return new Mage(name);
    }
}
