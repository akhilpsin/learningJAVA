package com.akhil.core.module2questions;


import java.util.Scanner;

public class reverseWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();

        String reversedString = reverseStringWordByWord(str);
        System.out.println("The reversed string is: " + reversedString);
    }

    public static String reverseStringWordByWord(String str) {
        String[] words = str.split(" ");

        String[] reversedWords = new String[words.length];
        for (int i = words.length - 1, j = 0; i >= 0; i--, j++) {
            reversedWords[j] = words[i];
        }

        String reversedString = String.join(" ", reversedWords);

        return reversedString;
    }
}
