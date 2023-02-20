package com.example.multilevel;

class A{
    public void aMethod(){
        System.out.println("A:: aMethod");
    }
}
class B extends  A{
    public void bMethod(){
        System.out.println("B:: bMethod");
    }
}
class C extends B{
    public void cMethod(){
        System.out.println("C:: cMethod");
    }

   /* public void aMethod(){
        System.out.println("C:: aMethod");
    }*/
}
public class MutltiLevelInheritance {
    public static void main(String[] args) {
      /*  C c= new C();
        c.aMethod();
        c.bMethod();
        c.cMethod();*/

        A a= new C();
        a.aMethod();
    }
}

