package com.bridgelabz;
public class Employee {
    String name;
    double salary;
    int id;

    Employee(int id,double salary,String name){
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    public double yearlySalary(){
        return salary;
    }

    public void display(){
        System.out.println("The Id of the Employee is " + id + " The name is " + name + " And the Salary of the Employee is " + salary);
    }
    public static void main(String[] args) {
        Employee adarsh = new Employee(21, 500000, "Adarsh");
        System.out.println(adarsh.yearlySalary());
        adarsh.display();
    }
}
