package com.akhil.core.module2questions;

import java.util.Scanner;

public class ConvertString {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please provide the string: ");
		String str = scn.nextLine();
		
		String LowerCase = "";
		for (int i=0;i<str.length();i++) {
			int charVal = str.charAt(i);
			
			if(charVal >=65 && charVal <=90){
				charVal+=32;
			}
			LowerCase += (char) charVal;	
		}
		
		String UpperCsase = "";
		for (int i=0;i<str.length();i++) {
			int charVal = str.charAt(i);

			if(charVal >=97 && charVal <=122){
				charVal-=32;
			}
			UpperCsase += (char) charVal;	
		}
		
		System.out.println(LowerCase);
		System.out.println(UpperCsase);
		
	}

}
