package com.ogutdeniz.creationalpatterns.prototype.enemyexample;

public class EnemyTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Enemy originalEnemy = new Enemy("Goblin", 100, 10);
        Enemy newEnemy = originalEnemy.clone();

        originalEnemy.setName("Orc");
        originalEnemy.setHealth(200);
        System.out.println(originalEnemy); // prints "Enemy[name=Orc, health=200, attack=10]"
        System.out.println(newEnemy); // prints "Enemy[name=Goblin, health=100, attack=10]"
    }
}
