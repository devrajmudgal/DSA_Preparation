class Student{
    int rollNo;
    String name;
    int age;
}

public class ArrayOfObjects {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNo = 21;
        s1.name = "Devraj";
        s1.age = 20;

        Student s2 = new Student();
        s2.rollNo = 34;
        s2.name = "Ayush";
        s2.age = 19;

        Student s3 = new Student();
        s3.rollNo = 67;
        s3.name = "Prakash";
        s3.age = 18;

//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);

        Student[] students = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        
        for(int i=0;i< students.length;i++){
            Student s = students[i];
            System.out.println(s.name+" "+s.rollNo+" "+s.age);
        }


    }
}
