package com.company;

public class Warrior extends Hero{
    public Warrior(int health, int damage) {
        super(health, damage);
    }

    @Override
    public String applySuperAbility() {
        super.applySuperAbility();
        return "Warrior супер ударды алды";
    }
}
