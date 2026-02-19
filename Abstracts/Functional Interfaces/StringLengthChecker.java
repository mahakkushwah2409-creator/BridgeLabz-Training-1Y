import java.util.function.Function;

public class StringLengthChecker {

    public static void main(String[] args) {

        int characterLimit = 20;

        // Function to calculate string length
        Function<String, Integer> getLength = message -> message.length();

        String message = "Hello Java Programming";

        int length = getLength.apply(message);

        System.out.println("Message: " + message);
        System.out.println("Length: " + length);

        if (length > characterLimit) {
            System.out.println("Message exceeds the character limit!");
        } else {
            System.out.println("Message is within the limit.");
        }
    }
}
