package JAVA_Automations;

import java.util.Scanner;

public class Switch_Bankstat {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int balance = 500;

      int pin =1234;


        System.out.println("press 1 for withdrawn");
        System.out.println("press 2 for balance check");
        System.out.println("press 3 for add amount");
        System.out.println("press 4 for PIN change");

        System.out.println("enter choice");
        int choice = sc.nextInt();

        switch (choice)
        {
            case 1:
                System.out.println("the current balnce is " + balance);

                System.out.println("Enter withdrawn amount");
                int withdrawn_balance = sc.nextInt();

                if(withdrawn_balance>=balance)
                {

                    System.out.println("you have insufficient balamce" + balance);


                }
                else {
                  balance=  balance- withdrawn_balance;
                    System.out.println("the current balance is" + balance);


                }
                break;

            case 2:

                System.out.println("current balance is" + balance);

                break;

            case 3:
                System.out.println("enter amount to add");
                int Add_amount= sc.nextInt();
                balance= balance + Add_amount;

                System.out.println("the current balance after add is " + balance);
                break;

            case 4:
                System.out.println("enter the PIN number");
                int current_PIN=sc.nextInt();
                if(current_PIN==pin)
                {
                    System.out.println("You have successfully logged in");
                }
                else
                {
                    System.out.println("you have entered wrong PIN");

                    System.out.println("enter new pin for change");
                    int newpin=sc.nextInt();
                    pin=newpin;
                    System.out.println("the new pin is " +pin);
                }
                break;
            default:
                System.out.println("please enter a valid choice  \n");

                main(args)  ;
                return;
        }

    }
}
