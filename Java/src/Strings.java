public class Strings {
    public static void main(String[] args) {
        String s = "Devraj";
        String str = new String("Mudgal");
        System.out.println(s+" "+str); // concatenation
        System.out.println(s.charAt(4)); 
        System.out.println(s.length());
        System.out.println(s.toLowerCase());
        
        String newStr = new String("Hello ");
        System.out.println(newStr.concat(" World"));

        //String are not repeated instead stored in constant String pool and later deleted from memory using garbage collector

    }
}
