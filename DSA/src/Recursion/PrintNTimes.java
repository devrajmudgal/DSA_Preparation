package Recursion;

public class PrintNTimes {
    public static void printNTimes(int n){
//        if(n==0) return;
//        System.out.println(n);
//        printNTimes(n-1);
        if(n==0) return;
        printNTimes(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        printNTimes(5);
    }
}
