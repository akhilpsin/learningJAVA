package CodeChallenge1;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the limit : ");
        int num = scn.nextInt();

        int count;

        for (int i = 1; i <= num; i++) {
            count = 0;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.println(i);
            }
        }
    }
}