package com.company;

public class MagicDoor {

    public String[] heroes2;

    public MagicDoor() {


    }

    public String[] rem() {
        Hero h1 = new Hero();
        h1.heroes = new String[]{"Physical", "Magical", "Mental", "Medical"};
        this.heroes2 = h1.heroes;
        return heroes2;
    }

}







