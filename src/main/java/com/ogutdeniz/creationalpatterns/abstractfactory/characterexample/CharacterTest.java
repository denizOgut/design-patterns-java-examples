package com.ogutdeniz.creationalpatterns.abstractfactory.characterexample;

import com.ogutdeniz.creationalpatterns.abstractfactory.characterexample.factory.MageFactory;
import com.ogutdeniz.creationalpatterns.abstractfactory.characterexample.factory.WarriorFactory;

public class CharacterTest {
    public static void main(String[] args) {
        CharacterFactory warriorFactory = new WarriorFactory();
        CharacterFactory mageFactory = new MageFactory();

        Character warrior = warriorFactory.createCharacter("Sir Lancelot");
        Character mage = mageFactory.createCharacter("Gandalf");

        warrior.useAbility();
        mage.useAbility();
    }
}
