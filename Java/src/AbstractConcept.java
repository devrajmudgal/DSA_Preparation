abstract class Car{
    abstract public void drive();
    public abstract void fly();
    public void playMusic(){
        System.out.println("Music playing...");
    }
}

abstract class Fortuner extends Car{
    public void drive(){
        System.out.println("driving...");
    }
}

class AdvancedFortuner extends Fortuner{
    public void fly(){
        System.out.println("Flying...");
    }
}
public class AbstractConcept {
    public static void main(String[] args) {
//        Car car = new Car(); ----> X
//        Fortuner fr = new Fortuner(); ---> X
//        fr.drive();
//        fr.playMusic();

        AdvancedFortuner aDF = new AdvancedFortuner();

        aDF.drive();
        aDF.playMusic();
        aDF.fly();

    }
}
