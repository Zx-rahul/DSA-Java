package FunctionalProgramming;

// Step 1: Define a functional interface
@FunctionalInterface
interface Greeting {
    void sayHello();
}

public class TestingLambda {
    public static void main(String[] args) {
        // Step 2: Assign the lambda expression to an instance of the interface
        Greeting greeting = () -> System.out.println("hello");

        // Step 3: Invoke the method
        greeting.sayHello();
    }
}
