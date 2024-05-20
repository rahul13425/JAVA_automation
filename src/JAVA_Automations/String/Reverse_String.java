package JAVA_Automations.String;

public class Reverse_String {

    public static void main(String[] args) {
        String str="oyo";

        char [] ajju= str.toCharArray();  // convert string into Array

       int start = 0;
       int end = ajju.length-1;

       while (start<end){
           char temp =ajju[start];
           ajju[start]=ajju[end];
           ajju[end]=temp;

           start++;
           end--;

       }
//
//       for (int i= 0; i< ajju.length; i++)
//           System.out.println(ajju[i]);

       String reverse= new String(ajju);  // convert array into string
        System.out.println(reverse);

        if(str.equalsIgnoreCase(reverse))
        {
            System.out.println("pallinfrome");
        }

        else
        {
            System.out.println("not pallindrom");
        }
    }


}
