package com.bridgelabz;
public class Dog {
    private String breed;
    private int age;
    private double weight;

    Dog(String breed,int age,double weight){
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    public int calculateAgeOfDogInHumanAge(){
        // Assuming 1 dog year is approximately 6 human years
        return 6 * age;
    }

    public void displayDogDetail(){
        System.out.println("The breed of this dog is " + breed + " And the age of this dog is " + age + " The age in human years is " + calculateAgeOfDogInHumanAge() + " And the weight of the dog is  " + weight + " kg.");
    }
    public static void main(String[] args) {
        Dog dog1 = new Dog("Libra", 4, 15);
        dog1.displayDogDetail();
    }
}
