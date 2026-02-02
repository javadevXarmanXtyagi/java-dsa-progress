package Basic;

public class Operators {
    public static void main(String[] args) {
        arithmeticDemo();
        unaryDemo();
        assignmentDemo();
        comparisonDemo();
        conditionalorlogicalDemo();


    }

    private static void arithmeticDemo() {
        // System.out.println(10 + (40 *4));
        System.out.println("------ Arithmetic Operators -----");
        int a = 9, b = 3;
        System.out.println("a + b = " +  (a + b));
        System.out.println("a - b = " +  (a - b));
        System.out.println("a * b = " +  (a * b));
        System.out.println("a / b = " +  (a / b));
        System.out.println("a % b = " +  (a % b));
    }

    private static void unaryDemo()
    {
        System.out.println("---------Unary Operators----------");
        int x = 5;
        System.out.println("++x = " + (++x)); //6
        System.out.println("x++ = " + (x++)); //6, then become 7
        System.out.println("x after post-increment  = " + x); // 7
        System.out.println("-x = " + (-x)); //-7
        System.out.println("(x>0) = " + ((x>0))); // true
    }

    private static void assignmentDemo(){
        System.out.println("----------------Assignment Operators-----------");
        int y = 10;
     //   y = y+5; // or
        y += 5;
        y *= 2;
        System.out.println("Y after +=  and *= :" + y);
    }

    private static void comparisonDemo()
    {
        System.out.println("---------Comparison Operators---------");
        int age = 18 ;
        System.out.println("age >= 18 : " + (age >=  18));
        System.out.println("age != 21 : "  + (age != 21));
    }
 /*
 Operator	Name	     Works On	     Returns True When	      Example	         Short-Circuit
&&	        Logical AND	 2 conditions	Both true	             a > 10 && b < 5	  ✅ Yes
||		`	Logical OR	                       2 conditions	                           At least one true
!	       Logical NOT	1 condition	     Condition is false	     !isRaining	         ❌ Not needed
  */
    private static void conditionalorlogicalDemo(){
        System.out.println("-----------Logical Operators-------");
        boolean isAdult = true;
        boolean hasTicket = false;
        if (isAdult || hasTicket)
        {
            System.out.println("Welcome!");
        }
        else {
            System.out.println("Bye!");
        }
         if((4>10) || (5<10)){
             System.out.println("hello");
        }

         //Ternary Operators
        // syntax  ==>  (condition) : (true) ? (false)
        System.out.println(  (isAdult && hasTicket) ? "welcome"  : "bye" );
         }
}
