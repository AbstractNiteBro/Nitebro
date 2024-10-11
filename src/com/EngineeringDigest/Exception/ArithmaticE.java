package com.EngineeringDigest.Exception;

public class ArithmaticE {
    public static void main(String[] args) {
        int[] numerators = {100, 200, 300, 400};
        int[] denominators = {2, 0, 6};

        for (int i = 0; i <numerators.length; i++) {
          try{  System.out.println(divide(numerators[i], denominators[i]));
          }catch(ArrayIndexOutOfBoundsException e){
              System.out.println( " Type : "+e);
          }

        }

        System.out.println("good job ");
    }

    public static int divide(int a, int b){
       try{
           return a/b;
       }
       catch (ArithmeticException e){
           System.out.println("Type : "+e);
       }
                return  -1;
            }
}
