package Methods;

import java.util.Scanner;

// make a function that give three number max according to the user
public class q {

    public static void max(int a , int b,int c){
        if(a<b && b>c){
            System.out.println("b maximum is = " + b);
        } else if (a>b && a>c) {
            System.out.println(" a maximum is = " + a);
        }
        else {
            System.out.println("C is maximum = " + c);
        }
    }
    public static void main(String[] args) {
    max(3,4,5);
    max(56,67,88);
    }
}
