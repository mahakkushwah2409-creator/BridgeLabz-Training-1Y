package wrapperClasses;

public class InputConversionUtility {

        // Using Integer Wrapper class method
        public static int safeParseInt(String input) {
            Integer value = null;  // Wrapper object

            try {
                value = Integer.valueOf(input); // Wrapper class conversion
            } catch (NumberFormatException e) {
                return -1;
            }

            return value; // auto-unboxing (Integer → int)
        }

        public static void main(String[] args) {

            String[] testInputs = {"123", "abc", "45.6", "0"};

            for (String input : testInputs) {
                int result = safeParseInt(input);
                System.out.println("Input: " + input + " -> Output: " + result);
            }
        }
    }

