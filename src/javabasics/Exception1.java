package javabasics;

import java.lang.reflect.Array;

public class Exception1 {
    public static void main(String[] args){
            int i = 0;
            int j=0;
            int num[]=new int[6];

            try{
                j=10/0;
               // System.out.println(j);
                System.out.println(num[0]);
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
            }
            catch(ArithmeticException  e)
            {
                j=10/5; // this is handle exception
                //System.out.println("cannot divisible by 0");
            }


        System.out.println(j);




    }
}
