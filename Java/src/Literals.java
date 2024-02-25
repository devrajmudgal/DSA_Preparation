public class Literals{
    public static void main(String[] args){
        int a = 0b101;
        System.out.println("a : "+a);

        int hex = 0xA;
        System.out.println("hex : "+hex);

        double val = 12e10;
        System.out.println("val : "+val);

        long curr = 10_00_00_000;
        System.out.println("curr: "+curr);

        char ch = 'a';
        ch=(char)(ch+1);
        System.out.println("ch : "+ch);
        
    }
}