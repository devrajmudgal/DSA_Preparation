class Students{
    String name;
    int Age;
    static String College;
}

public class StaticVariable {
    public static void main(String[] args){
        //Static Variables ---> common and shared among all the objects and should be accessed by class and not object conventionally.

        Students s1 = new Students();
        s1.name = "Hemant";
        s1.Age = 32;
        s1.College = "Juet";
        System.out.println(s1.name);
        System.out.println(s1.Age);
        System.out.println(s1.College);

        Students s2 = new Students();
        s2.name = "Kanak";
        s2.Age = 23;
        s2.College = "IIT";
        System.out.println(s2.name);
        System.out.println(s2.Age);
        System.out.println(s2.College);

        System.out.println(s1.College); //value changed as static variable



    }
}
