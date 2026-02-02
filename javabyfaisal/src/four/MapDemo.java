package four;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> userMap = new HashMap<>();
        userMap.put(1,"arman");
        userMap.put(2,"tyagi");
        userMap.put(3,"Khan");


        System.out.println("User with id 2 : " + userMap.get(2));
        System.out.println("ALL USERS");

        for (Map.Entry<Integer,String> entry : userMap.entrySet()){
            System.out.println(  entry.getKey() + " : " + entry.getValue());
        }
    }
}
