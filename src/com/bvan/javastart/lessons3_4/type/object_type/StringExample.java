package com.bvan.javastart.lessons3_4.type.object_type;

/**
 * @author bvanchuhov
 */
public class StringExample {

    public static void main(String[] args) {
        String s = "Hello, Java!";

        int len = s.length();
        System.out.println("len = " + len); // 11

        char c = s.charAt(1);
        System.out.println("c = " + c);

        char lastChar = s.charAt(s.length() - 1);
        System.out.println("lastChar = " + lastChar);

        String reversed = new StringBuilder(s).reverse().toString();
        System.out.println("reversed = " + reversed);
    }
}
