package JAVA_Automations.String;

public class Methods_of_string {
    public static void main(String[] args) {

        String str = "car= ";       //string initlitalization
        String str2 = "carpet ";
        String str3=str+str2;
        System.out.println(str3);
        System.out.println("The lenght is" + " "+ str3.length());// string length
        System.out.println(str3.toLowerCase());
        System.out.println(str3.toUpperCase());

        //tells whether two strings are equal or not.
        System.out.println(str.equals(str2));
//        String title="Live Ckient"                //live example  2 check wheather the strings are equal or not
//        String expected=driver.gettitle();
//        if(title.equalsIgnoreCase(expected)){
//            System.out.println("title isame");
//        }
        System.out.println(str.equalsIgnoreCase(str2));
        System.out.println(str.charAt(1));
        System.out.println(str.concat(str2));
        System.out.println(str.indexOf('O'));  //input only characters
        System.out.println(str2.startsWith("M")); // strings input
        System.out.println(str2.endsWith("s"));      // strings input
        System.out.println(str.compareTo(str2));   //lexicographically ceck  output (-80) because ASCII value is not equal to each other if equal then it shows 1 in the output

        /*
        "Lexicographically" refers to the ordering of words based on the alphabetical order of their component letters, similar to how words are ordered in a dictionary. In this context, lexicographical order is a generalization of the way dictionaries are sorted.
         */


        String[] spilit=str2.split("r");
//        System.out.println(spilit[0]);      when we have small string or array
//        System.out.println(spilit[1]);


        for(int i=0; i<spilit.length; i++)
        {
            System.out.println(spilit[i]);
        }

        String str4="Ajinkya Rahane";
        System.out.println(str4.substring(2));
        System.out.println(str4.substring(2,7));

        String str5= "1-16 of 26 reisults for 'iphone 15 pro max'";

        System.out.println(str5.indexOf("i"));
        System.out.println(str5.indexOf("x"));
//        System.out.println(str5.substring(24,41));

        String[] spilit2 =str5.split("'"); //string inilization //split by (') "1-16 of 26 reisults for 'iphone 15 pro max'";

        System.out.println(spilit2[1]);
//        for(int i=0; i<spilit2.length; i++)
//        {
//            System.out.println(spilit2[i]);
//        }


    }
}
