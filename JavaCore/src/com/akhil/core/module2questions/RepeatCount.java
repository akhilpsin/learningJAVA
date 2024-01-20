package com.akhil.core.module2questions;

import java.util.Scanner;

public class RepeatCount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();
        
        System.out.println("Repeating Words:");
        for (int i=0;i<str.length();i++) {
        	String[] words = str.split(Character.toString(str.charAt(i)));
        	
        	if (words.length-1>1) {
        		System.out.print(str.charAt(i));
        		System.out.print(",");
        	}
        	
        }

	}

}
