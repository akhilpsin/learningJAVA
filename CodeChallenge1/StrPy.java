//star pyramid pattern using ‘*’ in Java 
package CodeChallenge1;

import java.util.Scanner;

public class StrPy {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = scn.nextInt();

        for (int i = 0; i <= num; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= num - i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}
