class demoObjectClass{
    String modelNo;
    int price;

    public String toString(){
        return this.modelNo+" : "+this.price;
    }

    public boolean equals(demoObjectClass that){
        return this.modelNo == that.modelNo && this.price == that.price;
    }
}

public class ObjectClass {
    public static void main(String[] args) {
        demoObjectClass doc = new demoObjectClass();
        doc.modelNo = "Asd78";
        doc.price = 12343;

        demoObjectClass docNew = new demoObjectClass();
        docNew.modelNo = "Asd78";
        docNew.price = 12343;

//        System.out.println(doc == docNew);

        System.out.println(doc.equals(docNew));
//        System.out.println(doc.toString());

        System.out.println(doc);
    }
}
