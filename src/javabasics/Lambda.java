package javabasics;

@FunctionalInterface
interface Name{
    void show();
}
public class Lambda {
    public static void main(String[] args){
        Name obj = () -> System.out.println("the name is praveenm");
    obj.show();
    }
}
