package lecture3;

import java.util.Scanner;

// IF ELSE
public class CONDITIONALSTATEMENT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your age : ");
        int age = scanner.nextInt();
        if (age >= 18){
            System.out.println("You are Adult !");
        }
        else {
            System.out.println("You are not adult !");
        }
    }
}
