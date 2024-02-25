package BasicMathematics;

public class PrimeNo {
    public static void main(String args[]){
        int num = 7;
        int i=2;
        boolean count = false;
        while(i*i<num){
            if(num%i==0){
                count = true;
                break;
            }
            i++;
        }
        if(count==false)
            System.out.println(num + " is a prime number");
        else
            System.out.println(num + " is not prime");

    }
}
