package com.company;

public class Main {

    public static void main(String[] args) {

        Hero h1 = new Hero(700, 50, 2);
        Hero h2 = new Hero(710, 50, 3);
        Hero h3 = new Hero(720, 50, 5);
        Hero h4 = new Hero(730, 50, 1);

        Boss boss1 = new Boss();
        boss1.setHealth(800);
        boss1.setDamage(100);
        boss1.setProtectionType(boss1.setProtectionType());
        boss1.printBoss();

        MagicDoor door = new MagicDoor();
        door.returnHeroes(h1, h2, h3, h4);

    }
}
