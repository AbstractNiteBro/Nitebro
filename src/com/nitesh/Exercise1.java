package com.nitesh;
import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("Enter subject marks out of 100");

        System.out.print("english : ");
        Scanner sc1 = new Scanner(System.in);
        float eng = sc1.nextFloat();

        System.out.print("hindi : ");
        Scanner sc2 = new Scanner(System.in);
        float hin = sc2.nextFloat();

        System.out.print("science : ");
        Scanner sc3 = new Scanner(System.in);
        float sci = sc3.nextFloat();

        System.out.print("math : ");
        Scanner sc4 = new Scanner(System.in);
        float mat = sc4.nextFloat();

        System.out.print("Social science : ");
        Scanner sc5 = new Scanner(System.in);
        float sst = sc5.nextFloat();

        float sum = (eng+hin+sci+mat+sst)/5;
        System.out.printf("your percentage is %.2f",sum);
        System.out.print("%");

    }
}
