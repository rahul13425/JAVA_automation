package JAVA_Automations;

import java.util.Scanner;

public class LOOPS {

    //method creation
    public static void factorial(int num) {


        int res = 1;
        for (int i = num; i >= 1; i--) {
            res = res * i;

        }
        System.out.println("factorial of a " + num + " is = " +res);

    }

   public static void main(String[] args) {

        //object creation
        //LOOPS loops=new LOOPS();
       Scanner sc= new Scanner(System.in);
       System.out.println("enter a number");
       int num=sc.nextInt();
       LOOPS.factorial(num);
       // loops.factorial(num);
//
//       Scanner sc= new Scanner(System.in);
////        System.out.println("Enter a number");
////        int num= sc.nextInt();
//
//        int num = 0;
//        for(int i =1; i<=100; i++){
//            num=num+i;
//
//        }
//        System.out.println(num);
//
    }
    }


