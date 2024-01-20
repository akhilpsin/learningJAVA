package com.akhil.core.module2questions2;

import java.util.Arrays;

public class ThirdLarSecoSmall {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Find the third largest element
        int thirdLargest = arr[arr.length - 3];

        // Find the second smallest element
        int secondSmallest = arr[1];

        // Print the results
        System.out.println("The third largest element is: " + thirdLargest);
        System.out.println("The second smallest element is: " + secondSmallest);
    }
}