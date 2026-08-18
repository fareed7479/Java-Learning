package two;

import java.util.ArrayList;
import java.util.List;

class Car {
    String brand;
    Car(String brand) {
        this.brand = brand;
    }
}


public class Listdemo {

    public static void main(String[] args) {
        List<String> Users = new ArrayList<>();
        //List is a structure to store the duplicate Data
        //It Shows the oredered data that is stored in the database.
        //Generics"(List<String>)"-Defining the Type of DataStructures have to be used.
        //List is an Interface
        Users.add("Alive");
        Users.add("Bob");
        Users.add("Cummings");

        System.out.println(Users);
        for(String User : Users){
            System.out.println(User);
        }

        System.out.println("Indexed Base access "+Users.get(2));
        System.out.println("Reversed "+Users.reversed());
        System.out.println("Get the First Element "+Users.getFirst());


        //Adding the CarsList
        Car car1 = new Car("Benz");//List of Custom Objects.
        Car car2 = new Car("Toyota");

        List<Car> CarList = new ArrayList<>();

        CarList.add(car1);
        CarList.add(car2);

        System.out.println("===Cars==");
        for(Car carx : CarList){
            System.out.println(carx);
        }

    }
}
