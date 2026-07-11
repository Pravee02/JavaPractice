package javabasics;


 class PraveenException extends Exception{
     public PraveenException(String str){
        super(str);
     }
 }
public class UserDefinException {
public static void main(String[] args){
    int i = 20;
    int j = 0;
    try{
        j=10/i;
        if(j==0)
            throw new PraveenException("i dont want zero");
    }
    catch(PraveenException e){
        j=10/5;
        System.out.println("this is the actual output"+e);
    }
    System.out.println(j);

}


 }
