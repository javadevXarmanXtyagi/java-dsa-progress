package lecture3;

import java.util.Scanner;

public class hm2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a = ");
        int a = sc.nextInt();

        System.out.print("Enter b = ");
        int b = sc.nextInt();

        System.out.println("Choose operation:");
        System.out.println("1 : Addition (+)");
        System.out.println("2 : Subtraction (-)");
        System.out.println("3 : Multiplication (*)");
        System.out.println("4 : Division (/)");
        System.out.println("5 : Modulo (%)");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result = " + (a + b));
                break;

            case 2:
                System.out.println("Result = " + (a - b));
                break;

            case 3:
                System.out.println("Result = " + (a * b));
                break;

            case 4:
                if (b != 0) {
                    System.out.println("Result = " + (a / b));
                } else {
                    System.out.println("Error: Division by zero not allowed");
                }
                break;

            case 5:
                if (b != 0) {
                    System.out.println("Result = " + (a % b));
                } else {
                    System.out.println("Error: Modulo by zero not allowed");
                }
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}