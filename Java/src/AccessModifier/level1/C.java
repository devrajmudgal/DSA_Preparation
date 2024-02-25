package AccessModifier.level1;


class Launch{
    public void marks(){
        C c = new C();
        System.out.println(c.marks);
    }
}
public class C { // to use this class in outside package we need to make this public
    protected int marks = 23;

    public int getMarksFromC(){
        return marks;
    }
    public void show(){
        System.out.println(marks);
    }
}
