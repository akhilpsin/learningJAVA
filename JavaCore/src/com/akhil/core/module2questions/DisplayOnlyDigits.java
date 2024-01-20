package com.akhil.core.module2questions;
import java.util.Scanner;

public class DisplayOnlyDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an alphanumeric string: ");
		String inputString = scanner.nextLine();

		      
		System.out.println("Digits in the string are: ");
		for (char c : inputString.toCharArray()) {
			if (Character.isDigit(c)) {
		    System.out.print(c);
		            }
		        }

	}

}
