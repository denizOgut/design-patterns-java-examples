package com.ogutdeniz.creationalpatterns.prototype.enemyexample;

public class Enemy implements Cloneable {
    private String name;
    private int health;
    private int attack;

    public Enemy(String name, int health, int attack) {
        this.name = name;
        this.health = health;
        this.attack = attack;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public Enemy clone() throws CloneNotSupportedException {
        return (Enemy) super.clone();
    }

    public String toString() {
        return "Enemy[name=" + name + ", health=" + health + ", attack=" + attack + "]";
    }
}
