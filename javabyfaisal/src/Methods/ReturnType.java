package Methods;
///  return type
//   method  work in 2 ->  1) jo bhi andar h vo chlao  2) function ki khud ki value bhi ho skti h
public class ReturnType {
    public static int arman(int a){
        System.out.println("nabeel");
       if(a>0) return 5;
       else return  10;// return statement or end of method
    }
    public static void main(String[] args) {
        int x = arman(7);
        System.out.println( 3+ x);
       // arman(7);//stand alone call lgayi h bss
    }


}
