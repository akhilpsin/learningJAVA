package com.akhil.core.module2questions2;

import java.util.Arrays;


public class RmvElmFrmArr {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4};
		//initially sorting before removing the duplicate
		removeArr(a,2);
		
	}
	
	public static void removeArr(int[] array, int a) {

		for(int i=0;i<array.length;i++) {
			if (array[i]!=a) {
				System.out.println(array[i]);
				}
			}
		}
	}
