import java.util.Scanner;
import java.util.Arrays;

public class CharacterArrayComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String userInput = scanner.next();
        scanner.close();

        char[] customArray = stringToCharArrayCustom(userInput);
        char[] builtInArray = userInput.toCharArray();


        boolean isEqual = compareCharArrays(customArray, builtInArray);

        System.out.println("\nOriginal String: \"" + userInput + "\"");
        System.out.println("Custom Method Result: " + Arrays.toString(customArray));
        System.out.println("Built-in Method Result: " + Arrays.toString(builtInArray));
        System.out.println("Arrays are equal: " + isEqual);
    }

    public static char[] stringToCharArrayCustom(String str) {
  
        char[] charArray = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }

        return charArray;
    }


    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }


        return true;
    }
}
