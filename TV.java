package com.bridgelabz;
public class TV {
    private String brand;
    private double size;
    private int price;

    TV(String brand,double size,int price){
        this.brand = brand;
        this.size = size;
        this.price =price;
    }

    public double calculateDiscount(){
        double discountPercent = 0.0;
        if (size > 35) {
            discountPercent = 10.0; // in percent
        }
        return price*(discountPercent/100);
    }

    public void displayTVDetail(){
        System.out.println("The name of brand of tv is " + brand + " Size of the tv is " + size + " And the price of tv is " + price + " The discount on this tv is " + calculateDiscount());
    }
    public static void main(String[] args) {
        TV lg = new TV("LG", 45, 14000);
        lg.displayTVDetail();
    }
}
