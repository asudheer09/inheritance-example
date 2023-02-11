public class Animal {
    public String name;
    public String type;

    private int weight;

    protected String color;

    int  noOfLegs;

    Animal(String name,String type){
        System.out.println("calling Animal() class constructor");
        this.name=name;
        this.type=type;
    }

    public void walk(){
        System.out.println("animal is running");
    }

    public void sleep(){
        System.out.println("animal is sleeping");
    }

    public void eat(){
        System.out.println("animal is eating");
    }


}
