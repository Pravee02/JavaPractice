package javabasics;

enum Laptops {
macbook(1000),lenovo(1500),hp(500),dell(9000);

       private int price;

       private Laptops(int price)
       {
        this.price= price;
       }

    public int getPrice() {
        return price;
    }

    //public void setPrice(int price) {
      //  this.price = price;
    //}
}



public class Enumss {
    public static void main(String[] args){
        Laptops lap=Laptops.dell;
        System.out.println(lap+" : "+ lap.getPrice());

        for(Laptops l : Laptops.values()){
            System.out.println(l+" : "+l.getPrice());
        }
    }
}
