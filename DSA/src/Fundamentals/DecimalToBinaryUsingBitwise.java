package Fundamentals;
import java.util.*;

public class DecimalToBinaryUsingBitwise {
    public static void main(String[] args) {
        int again=1;
        while(again==1){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Decimal Number: ");

            int decimal = sc.nextInt();
            System.out.println();
            String Res = "";
            while(decimal!=0){
                Res = (decimal&1) + Res;
                decimal=decimal>>1;
            }
            System.out.println("Binary Result is: "+ Res );
            System.out.println();
            System.out.println("Press 1 to Continue & Press 0 to Stop: ");
            again = sc.nextInt();

                while(again!=1 && again!=0){
                    System.out.println("Enter Valid Input as per Instruction above: ");
                    again = sc.nextInt();
                }

        }
    }
}
