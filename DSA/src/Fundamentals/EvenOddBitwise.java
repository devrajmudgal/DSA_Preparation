package Fundamentals;
import java.util.*;

public class EvenOddBitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();

        var newStartTime = System.nanoTime();
        if(n%2==0) System.out.println("Even");
        else System.out.println("Odd");
        var newEndTime = System.nanoTime();
        System.out.println("Using Modulo % : "+(newEndTime-newStartTime));

        var startTime = System.nanoTime();
        if((n&1)==0) System.out.println("Even");
        else System.out.println("Odd");
        var endTime = System.nanoTime();
        System.out.println("using Bitwise & : "+(endTime-startTime));
    }
}
