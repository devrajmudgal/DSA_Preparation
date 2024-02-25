class AP{
    void Display(){
        System.out.println("In A");
    }
}

class BP extends AP{
    void Display(){
        System.out.println("In B");
    }
}

class CP extends BP{
    void Display(){
        System.out.println("In C");
    }
}


public class PolyMorphism {
    public static void main(String[] args) {

        //The below code snippet is known as Dynamic Method Dispatch

        // the Obj reference behaves differently for different Object

        // The Decision is taken at runtime

        //Works only in case of Inheritance

        AP obj = new AP();
        obj.Display();

        obj = new BP();
        obj.Display();

        obj = new CP();
        obj.Display();

    }
}
