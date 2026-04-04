package wrapperClasses;

public class UserInputValidation {

        public static boolean isValidAge(String input) {
            try {
                int age = Integer.parseInt(input); // String → int

                if (age >= 18) {
                    return true;
                } else {
                    return false;
                }

            } catch (NumberFormatException e) {
                return false; // invalid number
            }
        }

        public static void main(String[] args) {

            String[] testInputs = {"20", "17", "abc", "18"};

            for (String input : testInputs) {
                boolean result = isValidAge(input);
                System.out.println("Input: " + input + " -> Valid: " + result);
            }
        }
    }


