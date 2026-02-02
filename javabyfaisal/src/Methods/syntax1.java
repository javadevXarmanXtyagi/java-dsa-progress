package Methods;

public class syntax1 {

    public static void rishika(){
        System.out.println("Archit");
        ishan();
    }
    public static void ishan(){
        System.out.println("Lakshay");
        varad();
    }
    public static void main(String[] args) {
            rishika();
    }
    public static void varad(){
        System.out.println("malini");
        rishika();
    }
}
//archit,lakhsay, malini,archit,infinite