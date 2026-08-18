package one.classesDemo;


public class Car {

    String brand;
    String color;
    int speed;

    public Car(String brand, String color, int speed) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    public void drive(){
        System.out.println(brand + " is driving at "+ speed);
    }


}
