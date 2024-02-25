 class Calci{
//    final public void show(){
//        System.out.println("By Devraj !");
//    }
    final public void show(){
        System.out.println("By Devraj !");
    }

    public void add(int a,int b){
        System.out.println("A + B is : " + (a+b));
    }
}

class AdvCalci extends Calci{

}

public class Final {
    public static void main(String[] args) {
        //final --> variable ---> to make constant

//        final float pie = 3.14f;
//        pie = 5.6f ---> This gives Error!


        //final --> Methods  ---> to avoid Method overriding

        AdvCalci adv = new AdvCalci();
        adv.show();
        //final --> Class    ---> to avoid Inheritance
    }
}
