public class variables {
    public static void main(String[] args){
        //variables

        //integers
        int num1 = 23; //default
        long num2 = 3434l;
//      long long num3 = 434353; ---> no data types as long long in java
        short num3 = 3434;
        byte num4 = 112;

        // floating points numbers
        float num5 = 34.4545f;
        double num6 = 454.676; //default

        //characters

        char ch1 = 'a';
        char ch2 = '1';

        //boolean

        boolean bool1 = true;
        boolean bool2 = false;

        int a = 2;
        long b = a; //Conversion

        float f = 4.343f;

        int val1 = 34;
        short val2 = (short) val1; //casting;

        short val3 = 78;
        int val4 = val3; //automatic/implicit conversion

        byte b1 = 127;
        byte b2 = 87;

        int result = b1*b2; // automatic type promotion

        System.out.println(result);
    }
}
