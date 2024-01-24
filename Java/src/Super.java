class A extends Object{ // Every Class by Default Extends Object Class
  A(){
      super(); // calls the constructor of Object Class
      System.out.println("In A's default Constructor");
  }
   A(int a){
      super();
      System.out.println("In A's Parameterized Constructor");
  }
}
class B extends A{
   B(){
        super(7); // calls the contructor of Super class (parent class) which in this case is A.
        System.out.println("In B's Default Constructor");
    }
     B(int b){
        super(); // super is by default present in every class
        System.out.println("In B's Parameterized Constructor");
    }
}

public class Super {
    public static void main(String[] args) {
        B b = new B();
    }
}
