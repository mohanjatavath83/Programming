package com.mohan.classdemo;

class Student {
    int rollNumber;
    String name;
    double marks;

}


public class ClassDemo {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        s4.name="sudharshan";
        s1.name="sneha";
        s2.name="anusha";
        s3.name ="sayed";

        System.out.println(s1);
        Student s5 = s1;
        s5.rollNumber=10;
        System.out.println(s1.rollNumber);
        System.out.println(s5);

    }
}
