package Basic;

public class ControlFlow {
    /*
=========================================================================
           CONTROL FLOW IN JAVA
=========================================================================

🎈 What is Control Flow ?
Control flow means how your program execute statements based on conditions or loops.
Instead of running code  line by line blindly , you can tell java:

✅ "Do this if something is true ."
🔄 "Repeat this until a condition changes."
🔀 "Choose one path from many."

Java gives us three main types:
1. Decision-Making --> if ,else if ,else, switch
2. Loops (Iteration) --> for,while,do-while,enhanced for-each loops
3. Jump Statements --> break,continue


 */
    public static void main(String[] args) {
        // if-else
        int age = 18;
        if(age>18)
        {
            System.out.println("You can Open the Bank Account!💞");
        }
        else {
            System.out.println(" Sorry You are not eligible !🚫");
        }

        //if-else ladder
        int marks = 45;
        if(marks>= 90)
        {
            System.out.println("You are Very Intelligent In Class Exam!💖💖 ");
        } else if (marks>=70) {
            System.out.println("You are Intelligent in Class Exam !❤");

        } else if (marks>=60) {

            System.out.println("You Secure First Position ");
        }
        else if (marks>=50)
        {
            System.out.println("You need to study Hard!💔💔");
        }
        else {
            System.out.println("You are Fail in Exams!💘💘");
        }

        // switch statement
        String day  = "Sunday";
        switch (day)
        {
            case "Monday" -> System.out.println("Start of the Week !");
            case "Tuesday" -> System.out.println("Second day of week !");
            case "Wednesday" -> System.out.println("Third day of week!");
            case "Thirsday " -> System.out.println("Fourth day of  week");
            case "Friday" -> System.out.println("Fifth day of week");
            case "Saturday" -> System.out.println("Sixth day of week!");
            case "Sunday" -> System.out.println("Today is weekend ");
            default -> System.out.println("invalid day ");
        }

        //Loops
        //for
     /*   for (int i = 0 ; i< 10; i++)
        {
            System.out.println("Count :" + i );
        }*/

 /*       // while loop
        int num = 3;
        while (num > 0 ){
            System.out.println("Num:" + num);
            num--;
        }*/
        // Do - While
    /*    int n = 3;

        do {
            System.out.println("N : " + n);
            n--;
        }
        while (n>0);*/

        // Enhanced For Each
        String []fruits = { " Apple " , " Banana"};
        for( String fruit : fruits)
        {
            System.out.println("Fruits are :" + fruit);
        }

        for ( int i = 0 ; i<fruits.length; i++)
        {
            System.out.println("Fruits are :" + fruits[i]);
        }

        // JUMPS Statement
        // break and Continue
        for (int i = 0 ; i< 10; i++)
        {
            if (i== 3) continue;
            if (i==7) break;
            System.out.println("Count :" + i );
        }

    }
}
