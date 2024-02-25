class Human{
    private int age;
    private String Name;
    public int getAge(){ //getter
        return age;
    }
    public void setAge(int a){ //setter
        age = a;
    }

    public String getName(){ //getter
        return Name;
    }
    public void setName(String n){ //setter
        Name = n;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        //Enacapsulation --> Binding data Members and Method Together
        Human H = new Human();
        
        System.out.println(H.getAge());
        System.out.println(H.getName());

        H.setAge(45);
        H.setName("Ashok");
    }
}
