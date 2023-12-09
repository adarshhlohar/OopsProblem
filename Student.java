package com.bridgelabz;
public class Student {
    int id;
    int age;
    String name;

    Student(int id,int age,String name){
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public void display(){
        System.out.println("The name of the student is " + name + " age is " + age + " And the Id is " + id);
    }
    public static void main(String[] args) {
        Student adarsh = new Student(21, 22, "Adarsh");
        adarsh.display();
    }
}
