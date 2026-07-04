package javabasics;


class a{
    int age;

    public void show(){
        System.out.println("in a show ");
    }

    class b{
     void show1() {
         System.out.println("in b show ");
     }
    }

}
public class Innerclas {
    public static void main(String[] args){

        a obj = new a();
        obj.show();
        a.b obj1 = obj.new b();
        obj1.show1();
    }
}
