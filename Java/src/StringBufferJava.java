public class StringBufferJava {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Devraj");
//        System.out.println(sb.append("_Mudgal"));
        StringBuffer sbNew = sb.append(" _ Mudgal");
        System.out.println(sbNew);
    }
}
