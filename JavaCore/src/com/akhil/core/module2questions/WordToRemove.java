package com.akhil.core.module2questions;


import java.util.Arrays;

public class WordToRemove {

    public static void main(String[] args) {
        String str = "This is a sample string";
        String wordToRemove = "is";
        
        String[] words = str.split(" ");
        String[] newWords = new String[words.length - 1];

        
        int j = 0;
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(wordToRemove)) {
                newWords[j] = words[i];
                j++;
            }
        }

        String newStr = Arrays.toString(newWords);

        System.out.println(newStr);
    }
}
