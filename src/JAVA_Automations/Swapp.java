package JAVA_Automations;

import java.util.Scanner;

public class Swapp {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a= sc.nextInt();
        int b= sc.nextInt();
      //  int c;
        System.out.println("the value before swapping " + a + " "  + b );
//        c=a;
//        a=b;
//        b=c;

        a=a+b;   //a=4 b=2  a:6
        b=a-b;   //b=6-2=4
        a=a-b;
        System.out.println("the value after swapping "+ a + " "  + b );



    }
}
