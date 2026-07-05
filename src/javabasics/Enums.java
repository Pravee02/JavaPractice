package javabasics;
enum Status{
    Success,pending,completed,running;
}
public class Enums {
    public static void main(String[] args){
        int A= 10;
        Status s= Status.running;
       //Status s= Status.Failed; // not allowed beacues that word not in enum class
        System.out.println(s);
       System.out.println(s.ordinal());
        Status[] ss= Status.values();
        for(Status a : ss)
        {
            System.out.println(a+" :"+ a.ordinal());
        }


    }
}
