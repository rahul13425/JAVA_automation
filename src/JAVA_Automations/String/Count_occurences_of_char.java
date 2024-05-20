package JAVA_Automations.String;

public class Count_occurences_of_char {

    public static void main(String[] args) {

        String str = "Lets start testing";
        int count=0;

       for(int i =0;i<str.length();i++){
//           System.out.println(str.charAt(i));
           if(str.charAt(i)=='t'){
               count++;
           }
       }

        System.out.println(count);
    }
}
