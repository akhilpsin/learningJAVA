package com.akhil.core.module2questions;


public class RemoveFirstLast {

    public static void main(String[] args) {
        String str = "This is a sample string";
        String[] words = str.split(" ");

        for (int i = 1; i < words.length-1; i++) {
            System.out.print(words[i]);
            System.out.print(" ");
        }
    }
}
