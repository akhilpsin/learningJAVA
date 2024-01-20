package com.akhil.core.StrPrg;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Input your string: ");
		String s1=scn.nextLine();
		s1=s1.toLowerCase();
		System.out.println("Reversed: ");
		System.out.println(reverse(s1));
		
		if (reverse(s1).equals(s1)) {
			System.out.print("Is a Palendrome!!");
		}
		else {System.out.print("Is a Not Palendrome!!");}
		
		

	}
	
	public static String reverse(String s) {
		String rev = "";
		if (s==null || s==" ") {
			return null;
		}
		
		for (int i=s.length()-1;i>=0;i--) {
			
			rev+=s.charAt(i);
		}
		return rev;
	}

}
