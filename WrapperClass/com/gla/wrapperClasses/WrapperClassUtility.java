package wrapperClasses;

public class WrapperClassUtility {
    public static void main(String[] args) {

            // 1. String to int
            int num = Integer.parseInt("123");
            System.out.println("Integer.parseInt(\"123\") = " + num);

            // 2. String to double
            double d = Double.parseDouble("3.14");
            System.out.println("Double.parseDouble(\"3.14\") = " + d);

            // 3. String to boolean
            boolean bool = Boolean.parseBoolean("true");
            System.out.println("Boolean.parseBoolean(\"true\") = " + bool);

            // 4. Decimal to binary string
            String binary = Integer.toBinaryString(10);
            System.out.println("Integer.toBinaryString(10) = " + binary);

            // 5. Check if character is digit
            boolean isDigit = Character.isDigit('5');
            System.out.println("Character.isDigit('5') = " + isDigit);

            // 6. Convert to uppercase
            char upper = Character.toUpperCase('a');
            System.out.println("Character.toUpperCase('a') = " + upper);
        }
    }

