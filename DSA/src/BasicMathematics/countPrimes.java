package BasicMathematics;

public class countPrimes {
    public static void main(String[] args) {
        int count=0;
        int n=10;
        for(int i=2;i<n;i++){
            boolean isPrime = true;
            for(int j=2;j*j<=i;j++){
                if(i%j==0) {
                    isPrime = false;
                    break;
                }

            }
            if(isPrime == true){
                count++;
            }
        }
        System.out.println(count);
    }
}
