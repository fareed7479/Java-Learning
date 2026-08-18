package one.classesDemo;

public class CarObjectDemo {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota" , "Red" , 100);

//        car1.speed = 100;
//        car1.brand = "Toyota";
//        car1.color = "Red";
        car1.drive();

        Car car2 = new Car("BMW" , "Blue" , 200);

//        car2.speed = 130;
//        car2.brand = "BMW";
//        car2.color = "Blue";
        car2.drive();
    }
}
