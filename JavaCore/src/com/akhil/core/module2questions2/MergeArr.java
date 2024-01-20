package com.akhil.core.module2questions2;


public class MergeArr {

    public static void main(String[] args) {
        int[] firstArray = {56, 78, 90, 32, 67, 12};
        int[] secondArray = {11, 14, 9, 5, 2, 23, 15};
        int length = firstArray.length + secondArray.length;
        int[] mergedArray = new int[length];
        int i = 0, j = 0, k = 0;
        while (i < firstArray.length && j < secondArray.length) {
            if (firstArray[i] <= secondArray[j]) {
                mergedArray[k] = firstArray[i];
                i++;
            } else {
                mergedArray[k] = secondArray[j];
                j++;
            }
            k++;
        }
        while (i < firstArray.length) {
            mergedArray[k] = firstArray[i];
            i++;
            k++;
        }
        while (j < secondArray.length) {
            mergedArray[k] = secondArray[j];
            j++;
            k++;
        }
        System.out.println("Merged array:");
        for (int m = 0; m < mergedArray.length; m++) {
            System.out.println(mergedArray[m]);
        }
    }
}