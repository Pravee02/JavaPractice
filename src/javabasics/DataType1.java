package javabasics;

public class DataType1 {
    public static void main(String[] args) {
        long l = 9223372036854775807L;
        int a=2147483647;
        short s=32767;
        byte b=127;
        char c='Z';
        float f=3.14f;
        double d=3.14;
        boolean bb=true;


        System.out.println("the long highest value is "+ l );
        System.out.println("the int highest value is "+ a );
        System.out.println("the short highest value is "+ s );
        System.out.println("the byte highest value is "+ b );
        System.out.println("the char value is "+ c );
        System.out.println("the float  value is "+ f );
        System.out.println("the double  value is "+ d );
        System.out.println("the boolean value is "+ bb );



        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);

    }
}
