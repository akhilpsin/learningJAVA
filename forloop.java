import java.util.Scanner;

public class forloop {

    public static void main(String[] args) {

        System.out.println("Enter a Number: ");
        Scanner scn = new Scanner(System.in);

        int val = scn.nextInt();
        int check = 1;

        for (int i = 2; i <= val / 2; i++) {

            if (val % i == 0) {
                check = 0;
                break;
            }
        }

        if (check == 0) {
            System.out.println("Not Prime number");
        } else {
            System.out.println("Prime number");
        }

    }

}
