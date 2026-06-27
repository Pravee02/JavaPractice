package javabasics;

public class StringBuffer6 {
    public static void main(String[] args){

        StringBuffer sb=new StringBuffer("Praveen");
        System.out.println(sb.capacity());
        sb.append(" M");
        System.out.println(sb);
        String str=sb.toString();
        System.out.println(str);
    }
}
