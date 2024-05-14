package JAVA;

import java.util.Scanner;

public class if_else_if_ladder {

    public static void main (String [] args)
    {
       //Scanner object declaration
        Scanner sc = new Scanner(System.in);

        //user input
         System.out.print("Enter any number ");
         int num = sc.nextInt();

        if (num > 0)
            System.out.print("Its a positive number ");

        if(num < 0)
            System.out.print("Its a negative number ");

        if(num==0)
            System.out.print("Its a Zero ");
    }
}
