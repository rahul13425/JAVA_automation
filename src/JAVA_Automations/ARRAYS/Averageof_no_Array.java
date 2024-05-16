package JAVA_Automations.ARRAYS;

public class Averageof_no_Array {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int sum = 0;
        float avg = 0;

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

            avg = (float) sum / arr.length;

        }
        System.out.println("Sum of all no " + avg);
    }
}
