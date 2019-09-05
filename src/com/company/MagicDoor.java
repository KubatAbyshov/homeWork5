package com.company;

public class MagicDoor {

    public MagicDoor() {

        Hero h1 = new Hero();
        h1.name[0] = "Physical";
        h1.health = 50;
        h1.damage = 20;
        h1.superAbilities = 50;

        Hero h2 = new Hero();
        h2.name[1] = "Magical";
        h2.health = 50;
        h2.damage = 20;
        h2.superAbilities = 50;

        Hero h3 = new Hero();
        h3.name[2] = "Mental";
        h3.health = 50;
        h3.damage = 20;
        h3.superAbilities = 50;

        Hero h4 = new Hero();
        h4.name[3] = "Medical";
        h4.health = 50;
        h4.damage = 20;
        h4.superAbilities = 50;

        Hero[] heroes = {h1, h2, h3 ,h4};
        return;

        }


}








