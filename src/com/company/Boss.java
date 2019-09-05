package com.company;

import java.util.Random;

public class Boss {
    private double health;
    private double damage;
    private int protectionType;

    public void printBoss(){
        System.out.println("Здоровье Босса " + health + "\n" + "Наносимый урон Босса " + damage +"\n" +
                "Тип супер защиты Босса " + protectionType + "\n");
    }

    public int setProtectionType(){
        Random r = new Random();
        int type = r.nextInt(6);
        return type;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public int getProtectionType() {
        return protectionType;
    }

    public void setProtectionType(int protectionType) {
        this.protectionType = protectionType;
    }
}
