package com.akhil.core.module2questions2;

import java.util.Arrays;


public class removedupe {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,1,2,3,4,5,6};
		//initially sorting before removing the duplicate
		remDupp(sorter(a));
		
	}
	
	public static void remDupp(int[] array) {
		int count=0;
		for(int i=0;i<array.length-1;i++) {
			if (array[i]!=array[i+1]) {
				System.out.println(array[i]);
				count++;
			}
		}
		System.out.println(array[array.length-1]);
		
	}
	
	public static int[] sorter(int[] array) {
		
		for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
		
		return array;
	}
}
