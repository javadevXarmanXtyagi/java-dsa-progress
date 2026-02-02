package Basic;

public class MethodsQ {

 void makeTea()
 {
     System.out.println("Boil Water");
     System.out.println("Add Tea Leaves");
     System.out.println("Add sugar and Milk ");
     System.out.println("Tea is Ready !");
 }
    public static void main(String[] args) {
        MethodsQ kitchen = new MethodsQ();
        kitchen.makeTea();
    }
}
