import java.util.Scanner;

public class patterns2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the row : ");
        int row = scn.nextInt();

        for (int i = 1; i <= row; i++) {

            if (i == 1 || i == row) {
                for (int f = 1; f <= row; f++) {
                    System.out.print("* ");
                }
            } else {
                for (int f = 1; f <= row; f++) {
                    if (f == 1 || f == row) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();

        }

    }

}
