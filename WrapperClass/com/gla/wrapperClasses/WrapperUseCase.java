package wrapperClasses;

import java.util.Scanner;

public class WrapperUseCase {

        public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.next();
        int letters =0 ;
        int digits =0;
        int specialChars=0;


        for (char ch : str.toCharArray()) {

            if (Character.isLetter(ch)) {
                letters++;
            }
            else if (Character.isDigit(ch)) {
                digits++;
            }
            else if (!Character.isWhitespace(ch)) {
                specialChars++;
            }
        }

        // Output results
        System.out.println("Total Letters: " + letters);
        System.out.println("Total Digits: " + digits);
        System.out.println("Total Special Characters: " + specialChars);

        sc.close();
    }
    }

