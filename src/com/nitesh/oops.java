package com.nitesh;
public class oops {

    public static void main(String[] args) {
// sum of array method
        int [] arc = {5,6,66,8,419,86,};
        System.out.println(sumArray(arc));

// String method
        String st = "nitesh m";
        System.out.println(upCase(st));

// add method
        System.out.println(add(5,89));

        System.out.println(add(5,6,8,9,51,61,1,1,61,66,1948,1,94,49));
        System.out.println(write("nitesh"," nitin"," ravi"));

// prime number\
        System.out.println(isPrime(53));
        System.out.println(isPrime(17));
        System.out.println(isPrime(111));


        System.out.println("hello world");
    }



    //>>>>>>>methods<<<<<<<

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
//        System.out.println(sum);
        return sum;
    }

    private static String upCase(String str){
    return str.trim().toUpperCase();

    }

    public static int add(int i,int j){
        return i+j;
    }
    public static int add(int...a){
        int add =0;
        for (int i : a){
            add += i;
        }
        return add;
    }
    public static String write(String i,String j,String k){
        return i+j+k;
    }

    public static boolean isPrime(int x){
        int divs = 0;
        for(int i = 1; i< x/2; i++){
            if (x % i == 0){
                divs++;
            }
        }
        return divs == 1;
    }
}
