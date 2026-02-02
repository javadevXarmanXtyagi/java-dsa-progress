package Lecture4.Loops;
/*
for (initialization;condition;updation){
}   print 100 times hello world
  print 0 to 100
 */
public class For {
    public static void main(String[] args) {
        String name = "HELLO WORLD";
        // i++ = i = i+1;
        int i = 0;

        for (i = 0; i <= 10; i = i + 1) {
            System.out.println(i);
        }
    }
}
