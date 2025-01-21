package lambda;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        // Create a Consumer that prints a message with the input string
        Consumer<String> printMessage = message -> System.out.println("Message: " + message);

        // Use the Consumer
        printMessage.accept("Hello, World!");

        // Another example: Consumer that converts a string to uppercase and prints it
        Consumer<String> toUpperCaseAndPrint = str -> System.out.println(str.toUpperCase());

        // Use the Consumer
        toUpperCaseAndPrint.accept("java consumer example");

        // Chaining Consumers
        Consumer<String> combinedConsumer = printMessage.andThen(toUpperCaseAndPrint);

        // Use the combined Consumer
        combinedConsumer.accept("Chaining consumers in Java");
    }
}
