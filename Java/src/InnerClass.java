class DemoIC{ // outer class cannot be static
    int age = 56;

    void display(){
        System.out.println("In DemoIC");
    }

    static class InnerDemoIC{
        void display(){
            System.out.println("Inside InnerDemoIC");
        }
    }
}

public class InnerClass {
    public static void main(String[] args){
        DemoIC dic = new DemoIC();
        System.out.println(dic.age);
        dic.display();


        //when inner class is not static and is concrete
//        DemoIC.InnerDemoIC innerDic = dic.new InnerDemoIC();
//
//        innerDic.display();

//        when inner class is concrete

        DemoIC.InnerDemoIC innDic = new DemoIC.InnerDemoIC();
        innDic.display();
    }
}
