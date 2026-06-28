package javabasics;

    class Keyboard{
        int keys = 100;

        String color = "blue";

        public void hitnum(){
            System.out.println("hit number");
        }
        public void pressed(){
            System.out.println("key pressed");
        }
    }
    class AdvKeyboard extends Keyboard{
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


        }
    }

