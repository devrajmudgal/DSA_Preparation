class Calculator_new{
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public int add(int a, int b){
        return a+b;
    }

    public double add(double a, double b){
        return a+b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        //functions in java are methods
        Calculator_new cal = new Calculator_new();
        System.out.println(cal.add(2,3));
        System.out.println(cal.add(2,3,5));
        System.out.println(cal.add(2.56,4));


    }
}
