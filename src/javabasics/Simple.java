package javabasics;


class A{
    public int a = 1;
    public void show1(){
        System.out.println("A show");
    }
}
class B extends A{
    public void show2(){

        System.out.println("B show");
    }
}

public class Simple {
    public static void main(String[] args){
        A obj = new B();  // upcasting
        obj.show1();

        B obj1 =  (B) obj; // downcasting
        obj1.show2();



    }
}
