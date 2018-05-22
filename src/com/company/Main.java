package com.company;

public class Main {

    public static void main(String[] args) {
	Animal animal =  new Animal("bunny" , 123, 789 , 90 ,90);
        System.out.println( animal.getBody());
        System.out.println(animal.getName());
        System.out.println(animal.getWeight());

        dog newdog = new dog("bunny" , 234,789,88,90,89 , "90");

        newdog.eat();
        newdog.walk();
        newdog.run();

        }

        fish newfish = new fish( "venus" , 67,90,80,70,70,70,80 );





    }




