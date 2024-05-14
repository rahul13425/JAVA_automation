package JAVA_Automations;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        // fibonacci series :- 0,1(add this number in the sequence wise) ,1,2,3,5,....

        int firstno= 0;
        int secondno=1;


        System.out.println("enter a number");

        int num= sc.nextInt();
        System.out.print(firstno + " "  +secondno+ "\t");
        for(int i =3;i<=num;i++){

            int sum = firstno + secondno;
            System.out.print(sum +" ");

            firstno=secondno;
            secondno=sum;
        }
    }
}
