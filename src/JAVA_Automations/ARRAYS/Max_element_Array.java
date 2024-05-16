package JAVA_Automations.ARRAYS;

public class Max_element_Array {

    public static void main(String[] args) {

        int [] array = {1,2,3,4,5};

        int largelement= array[0];

        for (int i= 0; i<array.length; i++)

        {
            if(array[i]>largelement){
                largelement=array[i];

            }

        }
        System.out.println("largest element " + largelement);

    }


}
