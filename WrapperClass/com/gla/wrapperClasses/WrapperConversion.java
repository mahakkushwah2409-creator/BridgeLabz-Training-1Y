package wrapperClasses;

import java.util.Scanner;

public class WrapperConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a Integer");
        int num = sc.nextInt();
        Integer obj = num;
        System.out.println("Primitive Value " + num);
        System.out.println("Object value :" + obj);

        sc.close();
    }

}
