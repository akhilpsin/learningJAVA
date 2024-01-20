package com.akhil.core.ReturnObj;
import java.util.Scanner;

public class BookCreator {
	
	Book CreateNewBook() 
	{
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Author Name: ");
		String au = scn.next();
		System.out.println("Title: ");
		String ti = scn.next();
		System.out.println("Price: ");
		Double pi = scn.nextDouble();
		
		return new Book(ti,au,pi);
		
		
	}
}
