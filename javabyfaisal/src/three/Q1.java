package three;
//  take 2 variables a and b and print their sum
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        System.out.println("-------------------------------- " );
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number = ");
     int a =    sc.nextInt();
        System.out.print("Enter second number = ");
     int b = sc.nextInt();
     int c = a+b;
        System.out.println("Sum of two number is : "+ c);
    }
}
