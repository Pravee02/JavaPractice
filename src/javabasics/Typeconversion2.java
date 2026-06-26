package javabasics;

public class Typeconversion2 {
    public static void main(String[] args) {
        long l = 9223372036854775807L;
        int a = 2147483647;
        short s = 32767;
        byte b = 127;
        char c = 'Z';

        float f = 3.14f;
        double d = 3.14;
        boolean bb = true;

        // type conversion
        int h= (int) f;
        float v=a;

        double u=a;
        int i=(int)d;

        System.out.println("conversion of float to int "+ h);
        System.out.println("conversion of int to float "+ v);
        System.out.println("conversion of int to double "+ u);
        System.out.println("conversion of double to int "+ i);

    }
}
