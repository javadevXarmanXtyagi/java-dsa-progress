package Methods;
// ncr = n!/r*(n-r)!(combination)
// ex = 7c3 = 7!/3!*(7-3)!
// npr = n!/(n-r)! (permutation)

import java.util.Scanner;

// take 'n' and 'r' as input and print ncr
public class PermutationAndCombination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N = ");
        int n = sc.nextInt();
        System.out.print("Enter value of R = ");
        int r = sc.nextInt();
        int ncr = fact(n)/(fact(r)*fact(n-r));
        System.out.println(ncr);
        int npr = fact(n)/fact(n-r);
        System.out.println(npr);

    /*    int nFact= 1;
        for (int i = 1; i<=n; i++){
            nFact *=i;
        }

        int rFact= 1;
        for (int i = 1; i<=r; i++){
            rFact *=i;
        }

        int nMinusRFact= 1;
        for (int i = 1; i<=n-r; i++){
            nMinusRFact *=i;
        }
        int ncr = nFact/(rFact*nMinusRFact);
        System.out.println(ncr);*/

    }

    // thats why we use function
    public static int fact(int x ){
        int f= 1;
        for (int i = 1; i<=x; i++){
            f *=i;
        }
        return f;
    }
}
