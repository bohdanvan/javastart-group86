package com.bvan.javastart.lessons7_8.storing;

/**
 * @author bvanchuhov
 */
public class StringStoring1 {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = s1;

        s2 = s2 + ", world";

        System.out.println(s1); // Hello
        System.out.println(s2); // Hello, world
    }
}
