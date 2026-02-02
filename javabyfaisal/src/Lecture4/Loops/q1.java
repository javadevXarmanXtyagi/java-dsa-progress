package Lecture4.Loops;

import java.util.Scanner;

// print the sum of  first n natural  number ( n=4)
public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range of the numbers = ");
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 0; i<=n; i++){
            sum = sum+i;

        }
        System.out.print( " " + sum);
    }
}
