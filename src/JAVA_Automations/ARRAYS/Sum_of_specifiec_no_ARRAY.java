package JAVA_Automations.ARRAYS;

public class Sum_of_specifiec_no_ARRAY {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7,0};
        int sum = 7;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (sum == arr[i] + arr[j]+ arr[k]) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);


                    }
                }
            }


        }
    }
}

