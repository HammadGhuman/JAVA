package com.company;

public class Dog extends Animal{
    String color ="Black";
    Dog(){
        System.out.println("dog is created");
    }
    public void printColor(){
        System.out.println(color);//prints color of Dog class
        System.out.println(super.color);//prints color of Animal class
    }
    void eat(){System.out.println("eating bread...");}
    void bark(){System.out.println("barking...");}
    void work(){
        super.eat(); // it could be second statement inside method no error
        bark();
    }
}