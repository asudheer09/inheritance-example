package com.example.inheritance;

public class Test {
    public static void main(String[] args) {
        Parent p= new Parent(); //only you can access parent members
        Child c= new Child(); //parent class members+child class members
        // parent class reference can be used to hold the child class object.
        // by using parent class reference we can access only parent class members not child class members
        Parent p1= new Child();

        System.out.println(p.parentNumber);
        p.parentClassMethod();

        System.out.println(c.parentNumber);
        System.out.println(c.childNumber);
        c.parentClassMethod();
        c.childClassMethod();

        System.out.println(p1.parentNumber);
        p1.parentClassMethod();

        // Child c1= new Parent(); never allowed and gives compile time error.


    }
}
