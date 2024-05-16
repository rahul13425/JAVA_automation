package JAVA_Automations.ARRAYS;

import java.util.Scanner;

public class Array_min_elemt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //int[] array = {1, 2, 3, -4, 5};

        System.out.println("enter the size of the ARRAY ");
        int size = sc.nextInt();
        int[] array = new int[size];   // inilization of array

        System.out.println("enter the elements of the array ");


        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();             //array[0,1,2,3,4]=sc.nextInt(); when user adding array 1 by 1 it looks like this
        }
        int minelement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minelement) {
                minelement = array[i];
            }
        }
        System.out.println("minimum element in the array " + minelement);

        main(args);
    }

}



