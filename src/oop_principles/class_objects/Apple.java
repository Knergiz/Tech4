package oop_principles.class_objects;

public class Apple {



    //  default constructor
    public Apple(){


    }

    //one arg constructor
    public Apple(int number){
        System.out.println("One arg constructor is invoked with " + number);
    }

    public static void doNothing(){
        System.out.println("im doing nothing lol");

    }

    //define instance variables (color, taste, price)
    public String color;
    public String taste;
    public double price;



}
