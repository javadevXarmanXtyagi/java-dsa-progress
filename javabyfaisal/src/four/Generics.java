package four;

import java.util.HashSet;
import java.util.Set;

public class Generics {
    public static void main(String[] args) {

            Set<String> roles = new HashSet<>();
            roles.add("ADMIN");
            roles.add("USER");
            roles.add("MANAGER");
            for (String role  : roles){
                System.out.println("ROLE : " + role);
            }
        // here generic is used for type safety in this you see <String> this is known as generics in java <> in this ..
    }
}
