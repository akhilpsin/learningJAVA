package com.akhil.core.module2questions2;

public class OddEveArr {
	
	public static void main(String[] args) {
		int ar[]= {1,2,3,4,5,6,7,8,9};
		
		for(int i=0; i<ar.length;i++) {
			if (ar[i]%2==0) {
				System.out.println("Even: "+ar[i]);
			}
			else {
				System.out.println("Odd: "+ar[i]);
			}
			
		}
	}

}
