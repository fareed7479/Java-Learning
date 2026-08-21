package ExpressionsDemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//:: -> Method reference syntax


public class MethodReferenceDemo {

    public static void main(String[] args) {
        //::
        //1.Using for Loop
        List<String> names = Arrays.asList("Alice","Bob","charlie");
        for(int i = 0 ; i < names.size(); i++){
            System.out.println(names.get(i));
        }

        //2.Using enhancing for Each
        for(String name : names){
            System.out.println(name);
        }

        //Using the Consumer Method
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        //Using the Lamda Expression
        names.forEach((String name)-> {
            System.out.println(name);
        });

        //Using the Shorten Version of Lambda Expression
        names.forEach((name)->System.out.println(name));

        //Using the method refernce. '::'
        names.forEach(System.out::println);

        //Here the println statement know what to print and using the methid refernece
        //Each element is passed directly to the println method.
        //So it prints Each element over iteration.

    }
}
