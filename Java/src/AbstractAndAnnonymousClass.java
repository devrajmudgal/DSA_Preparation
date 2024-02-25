abstract class exAbs{
    abstract public void show();

    public void demoMethod(){
        System.out.println("Demo Method..");
    }
}

public class AbstractAndAnnonymousClass {

    public static void main(String[] args) {
        exAbs eas = new exAbs() {

            public void show() {
                System.out.println("In Show...");
            }
        };
        eas.show();
        eas.demoMethod();
    }
}
