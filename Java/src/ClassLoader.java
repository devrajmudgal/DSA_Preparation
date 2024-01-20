class Sample{
    int name;
    int age;
    int Height;
    static String College;
    static{
        College = "JUET";
        System.out.println("Class Loaded By Class Loader");
    }
}
public class ClassLoader {
    public static void main(String[] args) throws ClassNotFoundException{
        //How to load a Class with using the object creation method;
        Class.forName("Sample");
    }
}
