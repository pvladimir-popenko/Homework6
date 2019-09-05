package com.company;

public class Hero {
    double health;
    double damage;
    int superhint;

    public Hero(double health, double damage, int superhint) {
        this.health = health;
        this.damage = damage;
        this.superhint = superhint;
    }

    public void printHero(){
        System.out.println("Здоровье героя " + health + "\n" + "Наносимый урон " + damage +"\n" +
                "Тип супер атаки " + superhint + "\n");
    }
}
