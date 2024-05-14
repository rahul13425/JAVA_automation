package JAVA;
import java.util.Scanner;
public class Decision_control {

    public static void main(String [] args)
    {
        //Scanner object declaration
        Scanner sc = new Scanner(System.in);

        //user input
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        //check condition
        if(age >= 18) {
            //condition is true
            System.out.println("Can Vote!");

        }
        else {
            //condition is false
            System.out.println("Cannot Vote!");
        }
    }
}
