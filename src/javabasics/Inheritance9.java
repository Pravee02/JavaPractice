package javabasics;

    class Keyboard{
        int keys = 100;

        String color = "blue";



        Keyboard() {
            System.out.println("Keyboard printing");

        }


        public void hitnum(){
            System.out.println("hit number");
        }
        public void pressed(){
            System.out.println("key pressed");
        }
    }
    class AdvKeyboard extends Keyboard{


    AdvKeyboard() {
        //super();
        System.out.println("key 1");
    }


        public void throwit(){
            super.hitnum();
            System.out.println(keys);
            System.out.println("got it");
        }
    }


   public class Inheritance9{
        public static void main(String args[]){


            AdvKeyboard key1=new AdvKeyboard();
            key1.throwit();
            key1.hitnum();


        }
    }

