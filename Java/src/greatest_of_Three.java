public class greatest_of_Three {
    public static void main(String[] args) {
        int a = 4;
        int b = 2;
        int c = 6;
        /*
        if(a>b){
            if(a>c){
                System.out.println(a);
            }else{
                System.out.println(c);
            }
        }else{
            if(b>c){
                System.out.println(b);
            }else{
                System.out.println(c);
            }
        }
        */
        if(a>c && a>b)
            System.out.println(a);
        else if(b>c)
            System.out.println(b);
        else
            System.out.println(c);
    }
}
