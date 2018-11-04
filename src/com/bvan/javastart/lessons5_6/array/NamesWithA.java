package com.bvan.javastart.lessons5_6.array;

/**
 * @author bvanchuhov
 */
public class NamesWithA {

    public static void main(String[] args) {
        String[] names = {"Taras", "Andrey", "Ivan", "Masha", "Anton"};

        // first name with A
        String nameWithA = "";
        for (String name : names) {
            if (name.startsWith("A")) {
                nameWithA = name;
                break;
            }
        }
        System.out.println(nameWithA);

        // last name with A
        for (int i = names.length - 1; i >= 0; i--) {
            if (names[i].startsWith("A")) {
                System.out.println(names[i]);
                break;
            }
        }
    }
}
