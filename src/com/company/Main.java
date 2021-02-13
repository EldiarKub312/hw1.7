package com.company;

public class Main {

    public static void main(String[] args) {

        Medic medic = new Medic(15,25);
        Magic magic = new Magic(10,20);
        Warrior warrior = new Warrior(20,30);

        Hero[] name ={medic,magic,warrior};
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i].applySuperAbility());
        }

    }
}
