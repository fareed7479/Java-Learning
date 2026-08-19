package CollectionsDemo;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo {
    public static void main(String[] args) {
        Map<Integer , String> map = new HashMap<>();
        //Wrapper Classes -
        //The Primitive Dataypes can't be used as objects.
        //So int is used as Wrapper Class of Integer.
        //Since Map takes objects as Inputs.
        //Maps don't have duplicates.
        //Maps have unique Key Value's

        map.put(1, "Fareed");
        map.put(2, "Vijay");
        map.put(3, "Yaswanth");

        System.out.println("User with id 2 is: " + map.get(2));
    }
}

