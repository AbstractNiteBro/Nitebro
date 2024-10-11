package com.nitesh;

public class operator_precedence_associativity {
    public static void main(String [] args){

        int a = 1,b = 4,c = 5;
        int n =6*5-34/2;
        System.out.println(n);
        int m = 34/2-6*5;
        System.out.println(m);

        int i = ((b * b) - (4 * a * c)) / 2 * a;
       System.out.println(i);
    }

}