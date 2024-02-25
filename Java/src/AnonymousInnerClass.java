class tempAno{
    public void show(){
        System.out.println("Inside tempAno..");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        tempAno ta = new tempAno(){
            public void show(){
                System.out.println("Inside new tempAno..");
            }
        };

        ta.show();
    }
}
