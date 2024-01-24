class CollegeStudent{
    String name;
    int age;
    int rollNo;

    static String College;

    static {
        College = "Juet Guna";
        System.out.println("In static Block " + College);
    }

    CollegeStudent(){
        name = "Unknown";
        age = 0;
        rollNo = 0;

        System.out.println("Constructor Called");
    }
}

public class StaticBlock {
    public static void main(String[] args) {
        CollegeStudent CS = new CollegeStudent();
//        CS.age = 21;
//        CS.name = "Devraj";
//        CS.rollNo = 45;
        System.out.println(CS.name+" : "+CS.age+" : "+CS.rollNo+" : "+CS.College);
        System.out.println(CollegeStudent.College);

        CollegeStudent newCS = new CollegeStudent();


    }
}
