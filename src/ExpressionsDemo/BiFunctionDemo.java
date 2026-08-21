package ExpressionsDemo;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionDemo {

    //Functional Interfaces are always defined as static.
    public static BiFunction<Integer , Integer , Integer> addFunction = (a , b) -> (a + b);

    public static void main(String[] args) {

        //Apply() is used to pass the data for the functional Interface
        System.out.println(addFunction.apply(10,20));

        Function<Integer , Integer> multiplyBy2 = x -> x * 2;

        //Adding andThen Method to combine the two FUnctions.
        //This is called Chaining.
        //First the addFunction execuetes and later the output(sum) is multiplied by 2.
        BiFunction<Integer , Integer , Integer> CombinedFunction =
                addFunction.andThen(multiplyBy2);

        //result of combined Function.
        System.out.println(CombinedFunction.apply(10,20));
    }
}
