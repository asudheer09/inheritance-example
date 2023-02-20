package com.example.inheritance;

public class AnimalTest {
    public static void main(String[] args) {
       Dog dog= new Dog();
       dog.bark();
       dog.hunt();

       Animal animal= new Animal();
       animal.hunt();

       Animal animal1= new Dog();
       animal1.hunt();

    }
}
