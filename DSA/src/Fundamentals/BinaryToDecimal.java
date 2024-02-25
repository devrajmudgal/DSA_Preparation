package Fundamentals;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int Binary = 111;
        int index = 0;
        int ans=0;
        System.out.println(ans);
        while(Binary!=0){
            int lastDigit = Binary%10;
            Binary = Binary/10;
            if(lastDigit!=0){
                ans= (int) (ans+(lastDigit*Math.pow(2,index)));
            }
            index++;
        }
        System.out.println("In Decimal : "+ans);
    }
}
