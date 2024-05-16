package JAVA_Automations.ARRAYS;

import java.util.Scanner;

public class ADD2D_array {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int[][] arr=new int[2][2];
        int [][] array= new int [2][2];
//        int arr [][] = {
//                {1,2,3,4},
//                {9,8,7,6}
//        };

        int [][]total = new int[2][2];
        System.out.println("enter the elements in array 1");
         for( int i=0; i< arr.length; i++) {
             for (int j = 0; j < arr.length; j++) {
                 arr[i][j] = sc.nextInt();
             }
         }
        System.out.println("enter the element array 2" );
        for( int i=0; i< array.length; i++){
            for (int j=0; j< array.length; j++){

                array[i][j]=sc.nextInt();


            }}

        for(int i=0; i<total.length; i++) {
            for (int j = 0; j < total.length; j++) {
                total[i][j] = arr[i][j] + array[i][j];
            }

        }
        for (int i=0; i<total.length; i++){
            for (int j = 0; j < total.length; j++) {
                System.out.println(total[i][j]);
            }
        }




    }
}
