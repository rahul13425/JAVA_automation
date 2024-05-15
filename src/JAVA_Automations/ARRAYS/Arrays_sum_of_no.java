package JAVA_Automations.ARRAYS;

import java.util.Scanner;

public class Arrays_sum_of_no {

    public static void main(String[] args) {

        int size = 5;

        int[] arr = new int[size];   // array initilization

        Scanner sc = new Scanner(System.in);

        int sum =0;
        System.out.println("enter the elements");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }


        System.out.println("the elements are : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for(int i = 0; i < arr.length; i++)
        {
            sum=sum+ arr[i];               //game changer
        }
        System.out.println(sum);

    }
}
