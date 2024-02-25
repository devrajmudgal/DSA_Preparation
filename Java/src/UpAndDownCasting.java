class Parent{
    public void showMethod1(){
        System.out.println("in A");
    }
}
class Child extends Parent{
    public void showMethod2(){
        System.out.println("in B");
    }
}
public class UpAndDownCasting {
    public static void main(String[] args) {
        Parent p = (Parent) new Child(); // Upcasting
        p.showMethod1();

        Child ch = (Child) p; // DownCasting
        ch.showMethod2();
        ch.showMethod1();
    }
}
