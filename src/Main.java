public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Dog dog= new Dog("tom","pet");
        dog.sleep();
        dog.eat();
        dog.walk();
        System.out.println(dog.name);
        System.out.println(dog.type);
        //System.out.println(dog.);

    }
}