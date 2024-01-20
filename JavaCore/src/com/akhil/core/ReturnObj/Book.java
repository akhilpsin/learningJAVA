package com.akhil.core.ReturnObj;

public class Book {

		double price;
		String author, title;
		
		Book (String t, String a, double p)
		{
			title=t;
			author=a;
			price=p;
		}
		
		void display() 
		{
			System.out.println("Title: "+title);
			System.out.println("Author: "+author);
			System.out.println("Price: "+price);
		}
		

	}

