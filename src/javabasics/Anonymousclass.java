package javabasics;


abstract class M{

    public abstract void show1();


}
public class Anonymousclass {
    public static void main(String[] args) {
        M obj = new M() {
            public void show1() {
                System.out.println("in A1 show");

            }

        };
        obj.show1();
    }

}
