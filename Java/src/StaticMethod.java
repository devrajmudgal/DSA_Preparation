class staticMethodExample{
    int num1;
    int num2;
    static String operation;

    public void Show(){
        System.out.println(num1+" : "+num2+" : "+operation);
    }
    public static void Show1(staticMethodExample object){
        System.out.println(object.num1+" : "+object.num2+" : "+operation);
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        staticMethodExample SM = new staticMethodExample();
        SM.Show();
        SM.num1 = 2;
        SM.num2 = 3;
        staticMethodExample.operation = "Sum";

        staticMethodExample.Show1(SM);
    }
}
