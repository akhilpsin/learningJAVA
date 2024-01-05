//A Program To Print Inverted Half Pyramid Pattern Using Numbers In Java
package CodeChallenge1;

import java.util.Scanner;

public class InStarPyNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = scn.nextInt();

        for (int i = 0; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

        }

    }
}
