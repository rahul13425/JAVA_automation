package JAVA_Automations;

import java.sql.SQLOutput;

public class pallindrome {
   // when the reverse number shown correct then we do pallindrome
    public static void main(String[] args) {

        int a= 428;
        int original=a;
        int reverse_no = 0;

        while (a!=0)

        {
            int digit = a% 10;
            reverse_no= reverse_no* 10 + digit;

            a= a/10;

        }

        System.out.println(reverse_no);

        if(original==reverse_no)     // game changer line for  pallindrome
        {
            System.out.println(original +" is pallindrome");

        }
        else
            System.out.println(original +" is not  pallindrome");
    }

}
