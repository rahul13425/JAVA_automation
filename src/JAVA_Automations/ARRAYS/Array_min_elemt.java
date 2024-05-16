package JAVA_Automations.ARRAYS;

public class Array_min_elemt {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, -4, 5};

        int minelement = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minelement)
            {
                minelement = array[i];
            }
        }
        System.out.println("minimum element in the array " + minelement);
    }
}



