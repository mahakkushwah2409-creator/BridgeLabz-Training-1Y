import java.util.Scanner;

public class LowercaseConverter {

    public static String convertToLowerCaseCustom(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (currentChar >= 'A' && currentChar <= 'Z') {
                result.append((char) (currentChar + 32));
            } else {
                result.append(currentChar);
            }
        }
        return result.toString();
    }

  
    public static boolean compareStringsCustom(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a line of text (mix of cases):");
        String originalText = scanner.nextLine();

        String customLowerCase = convertToLowerCaseCustom(originalText);
        System.out.println("Custom lowercase version: " + customLowerCase);

        String builtInLowerCase = originalText.toLowerCase();
        System.out.println("Built-in lowercase version: " + builtInLowerCase);

        boolean areEqual = compareStringsCustom(customLowerCase, builtInLowerCase);

        if (areEqual) {
            System.out.println("The custom method and the built-in toLowerCase() method produce the same result.");
        } else {
            System.out.println("The methods produced different results.");
        }

        scanner.close();
    }
}
