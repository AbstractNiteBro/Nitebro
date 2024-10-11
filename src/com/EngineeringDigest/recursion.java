package com.EngineeringDigest;

public class recursion {
    public static void main(String[] args) {

        System.out.println(factorial(8));

        System.out.println(addNaturalNumbers(8));
    }

    public static int factorial(int n){
        if(n == 1){
            return 1;
        }
       return n * factorial(n-1);
    }

    public static int addNaturalNumbers(int n){
        if(n == 1){
            return 1;
        }
        return n + addNaturalNumbers(n-1);
    }
}
