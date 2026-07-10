package javabasics;
import java.lang.reflect.Array;

public class ThrowException {

    public static void main(String[] args){
        int i = 20;
        int j=0;


        try{
            j=18/i;
            if(j==0)
                throw new ArithmeticException("i dont want answer 0");

        }
        catch(ArithmeticException  e) {
            j=10/5; // this is handle exception
           System.out.println("thi is default out put"+e);
        }
        catch(Exception  e) {
            System.out.println("Something went wrong");
        }

        System.out.println(j);




    }
}
