//Write A Program To Print Hollow Rectangle Using “*” In Java
package CodeChallenge1;

import java.util.Scanner;

public class hollowRectFillNum {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the row : ");
        int row = scn.nextInt();
        int tem = row;

        for (int i = 1; i <= row; i++) {
            for (int f = 1; f <= row; f++) {
                System.out.print(tem + " ");
            }
            tem -= 1;
            System.out.println();
        }

    }
}
