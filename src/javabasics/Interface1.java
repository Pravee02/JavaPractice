package javabasics;


interface Computer
{
    void code();
}

class Laptop implements Computer
{
    public void code(){
        System.out.println("laptop using");
    }
}
class Desktop implements Computer{
    public void code(){
        System.out.println("using Desktop");
    }
}
class Developer{
    public void devapp(Computer c)
    {
        c.code();
    }
}

public class Interface1 {
    public static void main(String[] args){
        Computer lap= new Laptop();
        Computer desk=new Desktop();
        Developer praveen = new Developer();
        praveen.devapp(desk);


    }
}
 