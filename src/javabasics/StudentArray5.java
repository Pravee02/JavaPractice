package javabasics;

class Student{

    int rolno;
    String name;
    int marks;
}

public class StudentArray5 {
public static void main(String[] args){

    Student s1= new Student();
            s1.rolno=1;
            s1.name="Praveen";
            s1.marks=100;

    Student s2= new Student();
        s2.rolno=2;
        s2.name="Dhanush";
        s2.marks=88;

    Student s3= new Student();
        s3.rolno=3;
        s3.name="sharath";
        s3.marks=90;

        Student arr[]=new Student[3];
        arr[0]=s1;
        arr[1]=s2;
        arr[2]=s3;

        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i].name+"  "+arr[i].marks);

        }
        for(Student stud:arr){
            System.out.println(stud.name+" : "+stud.marks);
        }
}
}
