package JAVA_Automations.ARRAYS;

public class Array_specific_no_find {

    public static void main(String[] args) {

        int [] arr= {1,3,9,6,4};

        int fnum = 9;
        Boolean flag=false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == fnum) {
                flag = true;
                System.out.println(i);

            }
        }

        if(flag==true){
            System.out.println(fnum+ "is present");
        }
        else
        {
            System.out.println("no is not present");
        }

    }
}
