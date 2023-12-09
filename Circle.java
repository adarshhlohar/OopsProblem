package com.bridgelabz;
public class Circle {
    private int radius;

    Circle(int radius){
        this.radius = radius;
    }

    double calculateArea(){
        return Math.PI *radius*radius;
    }

    double calculateCircumference(){
        return 2*Math.PI*radius;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        double areaOfCircle = c1.calculateArea();
        System.out.println("The area of circle is " + areaOfCircle);
        double circumferenceOfCicle = c1.calculateCircumference();
        System.out.println("The circumference of circle is " + circumferenceOfCicle);
    }
}
