package com.gla.array;

public class StringBufferExample {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");

        sb.append("World");
        System.out.println("append: " + sb);

        sb.insert(5, ",");
        System.out.println("insert:" + sb);

        sb.replace(6,11, "java");
        System.out.println("replace:" + sb);

        sb.delete(5,6);
        System.out.println("delete:" + sb);

        sb.reverse();
        System.out.println("reverse:" + sb);

        System.out.println("length:" + sb.length());

        System.out.println("charAt(2):" + sb.charAt(2));

        System.out.println("setcharAt:" + sb);

        System.out.println("substring:" + sb.substring(1,4));

    }
}