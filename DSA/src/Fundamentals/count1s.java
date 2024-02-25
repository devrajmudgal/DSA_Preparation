package Fundamentals;

public class count1s {
    public static void main(String[] args) {
        int n = 15;
        int count=0;
        while(n!=0){
            count=count+(n&1);
            n=n>>1;
        }
        System.out.println(count);
    }
}
