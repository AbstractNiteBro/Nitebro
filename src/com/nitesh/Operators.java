package com.nitesh;

public class Operators {
    public static  void main(String [] args )
    {
        // arithmetic_operator ( +,-,*,/,++,--,%)
        System.out.println("// Arithmetic operators");
        int a = 2;
        int b = 4;
        int c = 5;
        System.out.println("add : "+(a+b));
        System.out.println("mul : "+(a*b));
        System.out.println("sub : "+(a-b));
        System.out.println("div : "+(b/a));
        System.out.println("remainder : "+(c%a)); // modulo operator


        // assignment_operator ( =, *=, +=, -=, /=)
        System.out.println("// Assignment operators");

        int i = 1;
        i += 9;
        System.out.println("i "+i);

        i *= 3;
        System.out.println("i "+i);

        //comparison_op
        System.out.println("// Comparsion operators");

        System.out.println(6==9);
        System.out.println(6==6);
        System.out.println(6>=6);
        System.out.println(6<9);
        System.out.println(6>=9);


        System.out.println("// Logical operators");

        System.out.println(true); //every single condition must true (and)
        System.out.println(true); //at least one condition must true (OR)
        System.out.println(false); //convert true into false and vise-versa


        System.out.println("// Bitwise operators");

        System.out.println(4&5);
           /* (4 = 100 in bits)     100
              (5 = 101 in bits)   & 101
                               ------------
                                    100
         */
        System.out.println("// Relational operator");
        int x = 2;
        int y = 4;
        boolean z = x > y;
        boolean z1 = x < y;
        System.out.println(z);
        System.out.println(z1);

    }
}
