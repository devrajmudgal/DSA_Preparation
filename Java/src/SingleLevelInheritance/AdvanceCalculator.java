package SingleLevelInheritance;

public class AdvanceCalculator extends Calculator { // Child , Derived , Sub Class
    public void multi(int a, int b){
        System.out.println("Multiplication is : "+(a*b));
    }
    public void div(int a, int b){
        System.out.println("Divison is : "+(a/b));
    }
}
