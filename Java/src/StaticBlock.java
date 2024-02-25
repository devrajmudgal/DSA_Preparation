class CollegeStudent{
    String name;
    int age;
    int rollNo;

    static String College;

   

    CollegeStudent(){
        name = "Devraj";
        age = 20;
        rollNo = 109 ;

        System.out.println("Constructor Called");
    }

     static { // executes only once when the class is loaded!
        College = "Juet Guna";
        System.out.println("In static Block " + College);
    }
    
}

public class StaticBlock {
    public static void main(String[] args) {
        // CollegeStudent CS = new CollegeStudent();
//        CS.age = 21;
//        CS.name = "Devraj";
//        CS.rollNo = 45;
        // System.out.println(CS.name+" : "+CS.age+" : "+CS.rollNo+" : "+CS.College);
        // System.out.println(CollegeStudent.College);

        // CollegeStudent newCS = new CollegeStudent();

        new CollegeStudent();
        new CollegeStudent();


    }
}
