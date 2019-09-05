package com.company;

public class MagicDoor {

    public Hero[] returnHeroes(Hero hero1,Hero hero2, Hero hero3, Hero hero4){
        System.out.println("Возвращенный массив из 4 Героев");
        Hero[] heroes = {hero1, hero2, hero3, hero4};

        for (Hero hero :
                heroes) {
            hero.printHero();
        }
        return heroes;
    }
}
