package com.bvan.javastart.lessons7_8.practice;

/**
 * @author bvanchuhov
 */
public class Words {

    public static void main(String[] args) {
        String[] words = {"Hello", "", "Java", "!"};

        System.out.println(totalLength(words)); // 10

        boolean containsEmptyWord = containsEmptyWordV2(words);
        System.out.println(containsEmptyWord);
    }

    public static boolean containsEmptyWord(String[] words) {
        for (String word : words) {
            if (word.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsEmptyWordV2(String[] words) {
        boolean containsEmptyWord = false;
        for (String word : words) {
            if (word.isEmpty()) {
                containsEmptyWord = true;
                break;
            }
        }
        return containsEmptyWord;
    }

    public static int totalLength(String[] words) {
        int totalLength = 0;
        for (String word : words) {
            totalLength += word.length();
        }
        return totalLength;
    }
}
