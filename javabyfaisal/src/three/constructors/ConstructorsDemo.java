package three.constructors;




public class ConstructorsDemo {
    public static void main(String[] args) {
         Car car1 = new Car("Toyota","Red",140);
     /*    car1.brand= "Toyota";
         car1.color= "White";
         car1.speed= 120;*/
         car1.drive();

         Car car2 = new Car("Bmw","Black",170);
     /*    car2.brand= "Bmw";
         car2.color="Black";
         car2.speed= 150;*/
        car2.drive();


    }
}
