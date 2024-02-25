class ANew {
  public ANew(){
      System.out.println("In ANew's Default Constructor");
  }
  public ANew(int a){
      System.out.println("In ANew's Parameterized Constructor");
  }
}
class BNew extends ANew {
    public BNew(){
        // super();

        this(5);
        System.out.println("In BNew's Default Constructor");
    }
    public BNew(int b){
        // this(); // calls all constructor of current class
        super(4);
        System.out.println("In BNew's Parameterized Constructor");
    }
}

public class ThisConstructor {
    public static void main(String[] args) {
        BNew BN = new BNew();
    }
}
