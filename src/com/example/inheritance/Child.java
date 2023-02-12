package com.example.inheritance;

public class Child extends Parent{
    public int childNumber=122;

    public  void childClassMethod(){

        System.out.println("childClassMethod()");
    }

    public void parentClassMethod(){
        System.out.println("Child: parentClassMethod");
    }
}
