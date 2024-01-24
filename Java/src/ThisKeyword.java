class NewHuman{
    private int age;
    private String Name;
    public int getAge(){ //getter
        return age;
    }
    public void setAge(int age){ //setter
        this.age = age;
    }

    public String getName(){ //getter
        return Name;
    }
//   public void setName(String Name,NewHuman obj){
//        obj.Name = Name;
//   }
    public void setName(String Name){ //setter
        this.Name = Name; //this holds the reference of current object (The object which is calling the method)
    }
}


public class ThisKeyword {
    public static void main(String[] args) {

        NewHuman H = new NewHuman();
        H.setAge(120);
//        H.setName("Taara",H);
        H.setName("Alex");
        System.out.println(H.getAge());
        System.out.println(H.getName());
    }
}

