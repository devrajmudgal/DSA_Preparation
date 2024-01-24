class ConstructorDemo{
    String name;
    int age;

    public ConstructorDemo(){ //default Constructor
        name = "Devraj";
        age = 20;
        System.out.println("In default constructor");
    }
    public ConstructorDemo(String name,int age){ //parameterised constructor
        this.name = name;
        this.age = age;
        System.out.println("In parameterised Constructor");
    }
}

public class Constructors {
    public static void main(String[] args){
        ConstructorDemo CD = new ConstructorDemo(); // here default constructor is called
        System.out.println(CD.name+" : "+CD.age);
        ConstructorDemo newCD = new ConstructorDemo("Ayush",21);
        System.out.println(newCD.name+" : "+newCD.age); // here a parameterised Constructor is called
    }
}
