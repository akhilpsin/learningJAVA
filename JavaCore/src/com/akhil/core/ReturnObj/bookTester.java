package com.akhil.core.ReturnObj;

public class bookTester {

	public static void main(String[] args) {
		BookCreator b1= new BookCreator();
		Book b2= b1.CreateNewBook();
		b2.display();
	}

}
