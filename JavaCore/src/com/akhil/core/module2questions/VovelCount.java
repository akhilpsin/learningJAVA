package com.akhil.core.module2questions;

import java.util.Scanner;

public class VovelCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = scanner.nextLine();

        int vowelCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vowelCount++;
            }
        }

        System.out.println("The number of vowels in the string is: " + vowelCount);
    }
}
