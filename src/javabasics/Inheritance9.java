package javabasics;

    class Keyboard{
//        int keys = 100;
//        String color = "blue";
//

        Keyboard() {
            System.out.println("Keyboard printing");

        }
        Keyboard(int n) {
            System.out.println("Keyboard printing int");

        }



//        public void hitnum(){
//            System.out.println("hit number");
//        }
//        public void pressed(){
//            System.out.println("key pressed");
//        }
    }


    class AdvKeyboard extends Keyboard{


       AdvKeyboard() {
        super();

        System.out.println("advkey ");
    }
        AdvKeyboard(int n) {

           //this();
            super(n);

            System.out.println("advkey 1");
        }




//        public void throwit(){
//            super.hitnum();
//            System.out.println(keys);
//            System.out.println("got it");
//        }
    }


   public class Inheritance9{
        public static void main(String args[]){


            AdvKeyboard key1=new AdvKeyboard();



        }
    }

