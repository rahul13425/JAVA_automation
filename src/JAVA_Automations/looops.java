package JAVA_Automations;

import java.util.Scanner;

public class looops {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int res= 1;
        for (int i=num; i>=1; i--)
        {
           res=res*i;
        }
        System.out.println(res);



    }
}
