class AnoObject {
    AnoObject(){
        System.out.println("Constructor Called");
    }
    void show(){
        System.out.println("show Method Called");
    }
}

public class AnonymousObject {
    public static void main(String[] args) {
        new AnoObject().show(); // Anonymous Object --> Cannot be reused again
        new AnoObject().show();// new Anonymous object
        new AnoObject().show();// new Anonymous object
    }
}
