//Create A Number Pyramid Program In Java
package CodeChallenge1;

import java.util.Scanner;

public class NumPyrmd2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = scn.nextInt();
        int count = 1;

        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();

        }

    }
}
