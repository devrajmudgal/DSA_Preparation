 public class StringBufferJava {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Devraj");

        System.out.println(sb.capacity());
//        System.out.println(sb.append("_Mudgal"));
        StringBuffer sbNew = sb.append(" _ Mudgal");

        System.out.println(sbNew.capacity());

        System.out.println(sb.capacity());

        System.out.println(sbNew);

        System.out.println(sb == sbNew);

        System.out.println(sb.length());
        System.out.println(sbNew.length());
        

    }
}
