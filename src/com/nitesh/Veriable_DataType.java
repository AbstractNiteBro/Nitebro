package com.nitesh;

import java.util.Scanner;

public class Veriable_DataType
{
    public static void main(String[] args)
    {
        int Number = 89;
        long number = 1000000000000000000L;
        System.out.println(Number);
        System.out.println(number);
        System.out.println(number+Number);


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 2;
        int value =(n*8);
        System.out.print("int -2^"+value+" to int 2^"+value+"-1");
    }
}