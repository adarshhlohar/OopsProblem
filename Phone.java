package com.bridgelabz;
public class Phone {
    private String make;
    private String model;
    private int storage;

    Phone(String make,String model,int storage){
        this.make = make;
        this.model = model;
        this.storage = storage;
    }

    public int caculatePrice(){
        return 200*storage;  // it will return the price of phone based on the storege
    }

    public void displayPhoneDetail(){
        System.out.println("The phone make id : " + make + " model is : " + model + " And the Storage of the Phone is " + storage + " And the price of this phone is : " + caculatePrice());
    }
    public static void main(String[] args) {
        Phone samsung = new Phone("Samsung", "S21", 128);
        samsung.displayPhoneDetail();
    }
}
