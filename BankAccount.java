package com.bridgelabz;
public class BankAccount {
    int balance;
    long accountNumber;

    BankAccount(int balance,long accountNumber){
        this.balance = balance;
        this.accountNumber = accountNumber;
    }
    public void deposite(int amount){
        this.balance = balance + amount;
        System.out.println("After depositing " + amount + " the total balance is " + balance);
    }

    public void widthraw(int amount){
        if (amount > balance) {
            System.out.println("Unsufficient fund");
        }else{
            this.balance = balance - amount;
            System.out.println("After Withrawing " + amount + " the remaining balance is " + balance);
        }
    }
    public static void main(String[] args) {
        BankAccount obj = new BankAccount(40000,11223344);
        obj.deposite(500);
        obj.widthraw(1000);
    }
}
