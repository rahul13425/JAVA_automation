package JAVA_Automations.ARRAYS;

public class Duplicate_no_Array {

    public static void main(String[] args) {

        int [] arr = {1,2,2,4,6,6,7,8};

        int find= 0;

        int num=2;  // find same no print how many times

        for (int i=0; i<arr.length-1; i++)

        {
            if (arr[i]== arr [i+1]){   /// (arr[i]== num) if user find how many times same no exist
                find++;

                System.out.println(arr[i]);

            }

        }
        System.out.println(find+ " " + "are duplicate element");
        }


    }

