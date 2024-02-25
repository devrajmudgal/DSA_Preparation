//import java.awt.*;

class CalculatorNew {
    int add(int a,int b){
        int result = a + b;
        return result;
    }
}
public class BasicClass {
    public static void main(String[] args) {
        int num1 = 23;
        int num2 = 34;
        CalculatorNew calc = new CalculatorNew();
        int result = calc.add(num1,num2);
        System.out.println(result);
    }
}
