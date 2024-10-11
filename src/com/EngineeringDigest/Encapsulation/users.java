package com.EngineeringDigest.Encapsulation;

public class users {
    public static void main(String[] args) {
        bankAccount user1 = new bankAccount();
        bankAccount user2 = new bankAccount();

        user1.setAccountNumber(38904848856L);
        System.out.println("Account number : "+user1.getAccountNumber());
        user1.deposit(10000);
        System.out.printf("              user 1 Your balance : %.2f \n",user1.getBalance());

        user1.withdraw(500);
        System.out.printf("               user 1 Your balance : %.2f \n",user1.getBalance());

        user1.deposit(5000);
        System.out.printf("              user 1 Your balance : %.2f \n \n \n ",user1.getBalance());


        user2.setAccountNumber(3890484886L);
        System.out.println("Account number : "+user2.getAccountNumber());
        user2.deposit(20000);
        System.out.printf("                    user 2 Your balance : %.2f \n",user2.getBalance());

        user2.withdraw(6000);
        System.out.printf("               user 2 Your balance : %.2f \n",user2.getBalance());

        user2.deposit(1000);
        System.out.printf("              user 2 Your balance : %.2f \n",user2.getBalance());

    }
}
