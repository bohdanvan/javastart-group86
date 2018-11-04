package com.bvan.javastart.lessons7_8.storing;

/**
 * @author bvanchuhov
 */
public class NullReference { // Java 8: Optional

    public static void main(String[] args) {
        String[] names = {"Ivan", "Vlad", "Masha"};
        String name = findFirstNameStartsWith(names, 'V');
        if (name != null) {
            int length = name.length();
            System.out.println(length);
        } else {
            System.out.println("Not found");
        }

    }

    public static String findFirstNameStartsWith(String[] names,
                                                 char firstLetter) {
        for (String name : names) {
            if (name.contains("" + firstLetter)) {
                return name;
            }
        }
        return null;
    }
}
