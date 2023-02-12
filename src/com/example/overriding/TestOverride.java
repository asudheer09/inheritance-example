package com.example.overriding;

public class TestOverride {
    public static void main(String[] args) {
        P p1= new P();
       // p1.marry(); //subbalakshmi
       // p1.property(); //land gold cash

        C c= new C();
       // c.marry(); //priya
       // c.property(); // land gold cash

        P p2= new C(); //runtime polymorphsim
        p2.property(); //land, gold , cash
        p2.marry(); //Priya


    }
}
