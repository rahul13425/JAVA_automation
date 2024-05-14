package JAVA;

import java.util.Scanner;

public class logical_operators {

        public static void main (String [] args)
        {
                Scanner sc = new Scanner(System.in);

                int age = sc.nextInt();

                if((age>=13 && age<=19))
                {
                        System.out.println("Teenager");
                }
                else {
                        System.out.println("Not a Teenager");
                }
        }

}
