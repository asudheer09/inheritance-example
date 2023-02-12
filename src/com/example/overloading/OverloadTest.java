package com.example.overloading;

public class OverloadTest {
    public void process(String s){
        System.out.println("string version");
    }

    public void process(Object s){
        System.out.println("Object version");
    }

    public static void main(String[] args) {
        OverloadTest overloadTest= new OverloadTest();
        overloadTest.process(null);
        overloadTest.process(123);
    }
}
