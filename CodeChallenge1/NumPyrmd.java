//Create A Number Pyramid Program In Java
package CodeChallenge1;

import java.util.Scanner;

public class NumPyrmd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = scn.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int k = i; k < num; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(num + 1 - i + " ");
            }
            System.out.println();

        }

    }
}
