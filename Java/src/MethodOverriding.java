class OverA {
    public void show(){
        System.out.println("In OverA show Method:");
    }
}
class OverB extends OverA {
    public void show(){
        System.out.println("In OverB show Method");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        OverB obj = new OverB();
        obj.show(); // show() method of OverB will Override the show() method of OverA
    }
}
