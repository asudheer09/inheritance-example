package com.example.inheritance.example;

public class Test {
    public static void main(String[] args) {
        ChildClass c= new ChildClass();
        c.superClassMethod();
        c.childClassMethod();

        SuperClass obj= new SuperClass();
        obj.superClassMethod();

        SuperClass parent= new ChildClass();
        parent.superClassMethod();

    }
}
