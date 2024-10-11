package com.nitesh;

import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {

       /* System.out.println("Please enter your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age>=18 && age <=70 ){
            System.out.println("you can drive");
        }
        else {
            System.out.println("you can not drive");
        } */

       /*
        System.out.println("Please enter your age");
        Scanner st = new Scanner (System.in);
        int age = st.nextInt();

        switch(age){
            case 18 :
                System.out.println("you are adult now");
                break;
            case 25 :
                System.out.println("get a job");
                break;
            case 60 :
                System.out.println("time to retire");
                break;
            default:
                System.out.println("enjoy your life");
        }
*/

/*
        System.out.println("Please enter your name");
        Scanner sn = new Scanner (System.in);
        String name = sn.next();

        switch(name){
            case "rahul" -> System.out.println("you are adult now");
            case "raj" -> System.out.println("get a job");
            case "rohit" -> System.out.println("time to retire");
            default -> System.out.println("enjoy your life");

        }
        */
        /*

        Scanner sa = new Scanner(System.in);
        System.out.print("enter your marks in math ");
        byte math = sa.nextByte();

        System.out.print("enter your marks in chemistry ");
        byte chemistry = sa.nextByte();

        System.out.print("enter your marks in physics ");
        byte physics = sa.nextByte();

        float avg = (math+chemistry+physics)/2.0f;

        if(avg>=40 && math>=33 && chemistry>=33 && physics>=33){
            System.out.println("PASS");
        }
        else {
            System.out.println("fail");
        }
        */
        /*
        System.out.println("Ene your income in lakh : ");
        Scanner sn = new Scanner(System.in);
        float income = sn.nextFloat();
        float tax = 0;

        if(income <= 2.5f){
            tax = tax + 0;
        }
        else if( income>2.5f && income<= 5.0f){
            tax = tax + 0.05f*(income - 2.5f);
        }
        else if( income>5.0f && income<=10.0f){
            tax = tax + 0.05f*(income - 2.5f);
            tax = tax + 0.2f *(income - 5.0f);
        }
        else if (income>10.0f){
            tax = tax + 0.05f*(income - 2.5f);
            tax = tax + 0.2f *(income - 5.0f);
            tax = tax + 0.3f *(income - 10.0f);
        }
        System.out.println(" the total tax paid by the employee is "+tax  );

        */

        /*

        Scanner scv = new Scanner(System.in);
         int day = scv.nextInt();

         switch(day){
             case 1 -> System.out.println("sunday");
             case 2 -> System.out.println("monday");
             case 3 -> System.out.println("tuesday");
             case 4 -> System.out.println("wednesday");
             case 5 -> System.out.println("thursday");
             case 6 -> System.out.println("friday");
             case 7 -> System.out.println("saturday");
         }
         */
        /*
        System.out.println("enter a year");
        Scanner sy = new Scanner(System.in);
        int year = sy.nextInt();

        if (year % 4==0){
            System.out.println("this is a leap year "+ year);
        }
        else{
            System.out.println("this is not a leap year");
        }
        */


        System.out.print("enter url ");
        Scanner su = new Scanner(System.in);
        String url = su.nextLine();

        if(url.endsWith(".org")){
            System.out.println("organigation website");
        }
        else if(url.endsWith(".in")){
            System.out.println("indian website");
        }
        else if(url.endsWith(".com")){
            System.out.println("commercial website");
        }
        else{
            System.out.println("not found");
        }

    }
}
