package javabasics;

 class Student1 {
    static int a=7;
    int b;
    public void display(){
        System.out.println(a+" : "+b);
    }

     static void display2() {
         System.out.println("Hello");
     }
 }


public class Static8{
     public static void main(String[] args) {
     Student1 s= new Student1();
         s.a=30; // this is laso valid but we need use class ofr static
         Student1.a=40;

     s.b=20;
     s.display();
     s.display2(); // we can call it but need to avoid it   
     Student1.display2();


     }

}