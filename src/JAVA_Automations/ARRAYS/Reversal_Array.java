package JAVA_Automations.ARRAYS;

public class Reversal_Array {

    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 2, 1};

        int start = 0;
        int end = arr.length - 1;
        
            System.out.println("The array before the reverse : ");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
        }

        while (start < end) {
            int store = arr[start];
            arr[start] = arr[end];
            arr[end] = store;

            start++;
            end--;
        }

        System.out.println("The array After the reverse : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
