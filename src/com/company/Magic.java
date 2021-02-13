package com.company;

public class Magic extends Hero {
    public Magic(int health, int damage) {
        super(health, damage);
    }

    @Override
    public String applySuperAbility() {
        super.applySuperAbility();
        return "Magic медиктин кучун алды";
    }
}
