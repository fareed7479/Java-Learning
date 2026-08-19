package ExpressionsDemo;
//In Functional Interface Only one Abstract Method is used.
//It can have any  number of default methods.
//We use Lamda Expression to implement it.
//We don't declare the functionality or Operations in Functional Interfaceses
//We implement the fucntionality using the similar like method overriding in Main Class


@FunctionalInterface
interface BookAction{
    //default method-1
    void perform();
}

@FunctionalInterface
interface Addition {
    //Parameters passed
    int add(int a , int b);
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {

        //Step - 1
        BookAction action1 = new BookAction() {
            @Override
            public void perform() {
              System.out.println("Action1 Performed");
            }
        };

        //Step-2
        BookAction action2 = () -> {
            System.out.println("Action2 Performed");
        };

        //Step - 3
        BookAction action3 = () -> System.out.println("Action3 Performed");

        action1.perform();
        action2.perform();
        action3.perform();

        //Functional Interface with parameters.
        Addition addition = (a , b) -> {
            return a+b;
        };
        System.out.println("Sum is : "+addition.add(10,20));

    }
}
