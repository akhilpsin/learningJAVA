package com.akhil.core.module2questions2;

public class multiply {

    public static void main(String[] args) {
        int a[][] = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        int b[][] = {{4, 4, 4}, {5, 5, 5}, {6, 7, 8}};
        int c[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
