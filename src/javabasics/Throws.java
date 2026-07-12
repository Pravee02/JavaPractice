package javabasics;

class C{

    public void show() throws ClassNotFoundException
    {
        Class.forName("calc");
    }
}


public class Throws {
    static{
        System.out.println("class loader");
    }
    public static void main(String[] args){
        C obj= new C();
        try{
            obj.show();
        }
        catch(ClassNotFoundException e){
            System.out.println("class not fount "+e);
        }


    }
}
