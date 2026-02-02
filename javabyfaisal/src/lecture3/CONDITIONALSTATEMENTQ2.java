package lecture3;
import  java.util.Scanner;
public class CONDITIONALSTATEMENTQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number = ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number = ");
        int b = sc.nextInt();
        if (a==b ){
            System.out.println("Numbers are Equal!");
        } else if (a>b) {
            System.out.println("a is greater! ");

        }
        else {
            System.out.println("a is lesser!");
        }

    }
}
