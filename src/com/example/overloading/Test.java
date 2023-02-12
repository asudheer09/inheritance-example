package com.example.overloading;

public class Test {

    public void m1(){
        System.out.println("zero arguements");
    }

    public void m1(int a){
        System.out.println("value is "+a);
    }

    public void m1(float a){
        System.out.println("value is "+a);
    }

    public void m1(int a, float b){
        System.out.println("value is a="+a+" b= "+b);
    }


    public static void main(String[] args) {
        Test test = new Test();
        test.m1();
        test.m1(10);
        test.m1(10.5f);
        test.m1(10,20);
        //test.m1(""); will be checked at compile

    }
}
