package JAVA_Automations;

public class Reverse_no {
    public static void main(String[] args) {

        int a= 102;
        int reverse_number = 0;
        while(a!=0)                     // in while loop a never be zero
        {
            int digit = a% 10;   // % gives us reminder
            reverse_number = reverse_number*10 + digit;
             a=a/10;    // (/) gives us quotient
        }
        System.out.println(reverse_number);
    }
}
