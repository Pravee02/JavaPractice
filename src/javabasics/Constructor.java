package javabasics;

class Person{
    String name;
    int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void display(){
        System.out.println(name+" " + age);
    }
}





public class Constructor {
    public static void main(String[] args){
        Person p=new Person("praveen",23);
        p.display();
    }

}
