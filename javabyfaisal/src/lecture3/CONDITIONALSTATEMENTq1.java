package lecture3;
import java.util.Scanner;

public class CONDITIONALSTATEMENTq1 {
    public static void main(String[] args) {
        // check given number is even or odd
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number = ");
        int number = sc.nextInt();
        if ( number %2 == 0){
            System.out.println("Number is Even!");
        }
        else {
            System.out.println("Number is odd!");
        }
    }
}
