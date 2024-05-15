package JAVA_Automations.ARRAYS;

import java.util.Scanner;

public class Array_basic_struct {
    public static void main(String[] args) {
      //  int [] arr= {1,2,3,4,5};

        int size=6;
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[size];
        System.out.println("enter elements");
     //   System.out.println(arr[0]);
        for(int i=0; i<arr.length; i++)
        {
           // System.out.println(arr[i]);
             arr[i]=sc.nextInt();  /// game changer line
        }
        System.out.println("the elements are");
        for(int i=0; i<arr.length; i++)
        {
             System.out.println(arr[i]);
           // arr[i]=sc.nextInt();
        }
    }
}
