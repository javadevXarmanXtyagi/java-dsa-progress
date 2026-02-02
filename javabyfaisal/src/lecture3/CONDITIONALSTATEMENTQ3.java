package lecture3;

import java.util.Scanner;

public class CONDITIONALSTATEMENTQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Press Button Number = ");
        int button = sc.nextInt();
 /*       if (button ==1){
            System.out.println("hello");
        } else if (button == 2) {
            System.out.println("Namaste");
        } else if (button ==3) {
            System.out.println("Bonjour");
        }
        else {
            System.out.println("Invalid Button ");
        }*/
        switch (button){
            case 1 :
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
