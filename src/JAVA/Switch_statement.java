package JAVA;

//import java.util.Scanner;
//
//public class Switch_statement {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter first no");
//        int a = sc.nextInt();
//
//        System.out.println("enter second no");
//
//        int b = sc.nextInt();
//
//
//        System.out.println("press 1 for addition");
//        System.out.println("press 2 for substraction");
//        System.out.println("press 3 for multiplication");
//        System.out.println("press 4 for division");
//
//        System.out.println("enter choice");
//        int choice = sc.nextInt();
//
//        int res;
//
//        switch (choice) {
//            case 1:
//                res= a+b;
//                System.out.println(res);
//                break;
//
//            case 2:
//                res= a-b;
//                System.out.println(res);
//                break;
//
//            case 3:
//                res= a*b;
//                System.out.println(res);
//                break;
//
//            case 4:
//
//                float div = (float)a / b;    // change int datatype to float through type cast
//                System.out.println(div);
//                break;
//
//            default:
//                System.out.println("Please enter a valid number");
//
//
//        }
//    }
//}
import java.util.Scanner;

public class Switch_statement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b = sc.nextInt();

        int res;

        System.out.println("Press 1 for addition");
        System.out.println("Press 2 for subtraction");
        System.out.println("Press 3 for multiplication");
        System.out.println("Press 4 for division");
        System.out.println("Enter your choice:");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                res = a + b;
                System.out.println("Result: " + res);
                break;
            case 2:
                res = a - b;
                System.out.println("Result: " + res);
                break;
            case 3:
                res = a * b;
                System.out.println("Result: " + res);
                break;
            case 4:
                if (b != 0) {
                    float div = (float) a / b;
                    System.out.println("Result: " + div);
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Please enter a valid choice.");
                main(args); // Recursive call to main method to allow re-entry of choice
                return;
        }
    }
}

