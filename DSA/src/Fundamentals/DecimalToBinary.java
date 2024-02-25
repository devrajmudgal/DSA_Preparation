package Fundamentals;
import java.util.*;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number in Decimal: ");
        int n = sc.nextInt();
        String res = "";
        while(n>0){
            int rem = n%2;
            n=n/2;
            res = rem + res;
        }
        System.out.println("In Binary: "+res);
    }
}
