package com.EngineeringDigest.Encapsulation;

public class bankAccount {
    private long accountNumber;
    private double balance;


    public void deposit(double amount){
        if(amount > 0 ){
            balance += amount;
            System.out.printf("Deposite %.2f \n", amount);
        }
        else System.out.print("invalid deposit amount");
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.printf("Withdraw %.2f \n", amount);

        }
        else System.out.print("invalid withdraw amount");
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
