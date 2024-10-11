package com.nitesh;

public class break_continue{
    public static void main(String[] arg){

//        for(int a=1; a<=5; a++)
//        {
//            System.out.println(a);
//            System.out.println("this is a loop");
//
//            if (a == 2)
//            {
//                System.out.println("ending of the loop");
//                break;
//            }
//        }


//        for(int b=1;b<=5; b++)
//        {
//            if (b == 3)
//            {
//               System.out.println("ending of the loop");
//               continue;
//            }
//            System.out.print(b);
//            System.out.println(" this is for loop ");
//        }
//
//        System.out.println("\n \n ###### Do while Loooooop ####### \n \n");

//        int i = 0;
//        do{
//            if (i==4) {
//                System.out.println("breaking at 4 and exit the loop");
//                break;
//            }
//            System.out.print(i);
//            System.out.println(" this is do while loop");
//            i++;
//
//        }
//        while(i<=6);
//        System.out.println("this is out of loop ");

        System.out.println("\n \n ###### Do while Continue Loooooop ####### \n \n");

//        int q = 0;
//        do{
//            q++;
//            if (q==4) {
//                System.out.println("breaking at 4 and exit the loop");
//                continue;
//            }
//            System.out.print(q);
//            System.out.println(" this is do while loop");
//
//        }
//        while(q<6);
//        System.out.println("this is out of loop ");
//
//
//        System.out.println("\n \n ###### While Break Loooooop ####### \n \n");

//        int m = 1;
//        while(m<=5){
//            if(m==3){
//                System.out.println("breaking at 3 and exit");
//                break;
//            }
//            System.out.print(m);
//            System.out.println(" this is while loop ");
//            m++;
//
//        }
//        System.out.println("this is out of while loop");

        System.out.println("\n \n ###### While Continue Loooooop ####### \n \n");

        int n = 0;
        while(n<=5){
            n++;
            if(n ==3){
                System.out.println("breaking at 3 and exit");
                continue;
            }
            System.out.print(n);
            System.out.println(" this is while loop ");

        }
        System.out.println("this is out of while loop");
    }

}
