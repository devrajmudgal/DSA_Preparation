package Recursion;

public class Sum {
    public static int printSum(int n){
        if(n==0) return 0;

        return n+printSum(n-1);
    }
    public static void main(String[] args) {
        int n=4;
        int sum = 0;
        System.out.println("Sum : "+printSum(n));
    }
}
