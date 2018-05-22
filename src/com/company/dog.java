package com.company;

public class dog extends Animal{

    private int eyes  ;
    private int legs ;
    private int teeth ;
    private String coat ;

    public dog(String name,  int size, int weight , int eyes, int legs , int teeth , String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.coat = coat;
        this.legs = legs;
        this.teeth= teeth;

    }

    private  void chew () {
        System.out.println("dog . chew called");
    }

    @Override
        public void eat() {
            System.out.println("dog.eat called");
            chew();
            super.eat();
    }

    public void walk() {
        System.out.println("dog.walk called");
        move(5);

    }
    public  void  run() {
        System.out.println("dog.run called");
        move(10);
    }
}


