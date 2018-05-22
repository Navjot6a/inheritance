package com.company;

public class fish extends Animal {

    private int gills;
    private int eyes;
    private int fins ;

    public fish(String name, int brain, int body, int size, int weight, int gills, int eyes, int fins) {
        super(name, brain, body, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest( ) {
        System.out.println("fish taking rest");

    }

    private void swim () {

    }

    private void movebackfin () {
        System.out.println("fish moving fins");

    }

    private void movemuscle ( ) {


    }


}
