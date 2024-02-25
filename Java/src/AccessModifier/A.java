package AccessModifier;

import AccessModifier.level1.C;

//Protected allow the access to the subClass in same or even other package

class D extends C{
    public void showMarks(){
        System.out.println(marks);
    }
}
public class A {
    public static void main(String[] args){
        B b = new B();
        System.out.println(b.getA());
        C c = new C();
        System.out.println(c.getMarksFromC());
    }
}
