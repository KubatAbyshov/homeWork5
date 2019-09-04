package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Hero h1 = new Hero(250, 20, 50);
        MagicDoor h2 = new MagicDoor();
        h2.rem();


       System.out.println(h2.heroes2[0] + " " + h2.heroes2[1] + " "
       + " " + h2.heroes2[2] + " " + h2.heroes2[3]);


    }
}
