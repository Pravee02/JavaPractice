package ProblemSolving;

public class Evenoradd {
    public static boolean evenoradd(int num){
        if(num%2==0) {
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args){
        System.out.println(evenoradd(4));
    }
}
