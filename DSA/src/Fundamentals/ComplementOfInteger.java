package Fundamentals;

public class ComplementOfInteger {
    public static void main(String[] args) {
        int a = 5;
        String ans = "";
        while(a!=0){
            int ld = a&1;
            if(ld==1) ld = 0;
            else ld = 1;
            ans = ld + ans;
            a=a>>1;
        }
        int i=0;
        int res=0;
        int num = Integer.parseInt(ans);
        while(num!=0){
            int ld = num%10;
            if(ld == 1){
                res = (int)(res + ld * Math.pow(2,i));
            }
            i++;
            num = num/10;
        }
        System.out.println("The Result is : " + res);
    }
}
