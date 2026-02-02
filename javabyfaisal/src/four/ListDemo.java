package four;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

class Car{
    String brand;
    Car(String brand){
        this.brand = brand;
    }
}

public class ListDemo {

    public static void main(String[] args) {
        List<String> users = new ArrayList<>();
        users.add("Arman");
        users.add("Tyagi");
        users.add("Khan");


        System.out.println("ALL USERS..");
        for (String user : users){
            System.out.println(user);
        }
        System.out.println("Element using index: " + users.get(1));


        Car car1 = new Car("toyota");
        Car car2 = new Car("ford");
   List<Car> carList = new ArrayList<>();
   carList.add(car1);
   carList.add(car2);

        System.out.println(" == All car ==");
        for (Car car: carList){
            System.out.println(car.brand);
        }

    }
}
