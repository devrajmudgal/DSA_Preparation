package BasicMathematics;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        long n = sc.nextInt();
        if(n==0||n==1){
            System.out.println("Factorial of : "+n+" is : "+1);
        }else{
            long ans = 1;
            for(int i=2;i<=n;i++){
                ans = ans * i;
            }
            System.out.println("The Factorial of : " + n + " is : " + ans);
        }

    }
}
