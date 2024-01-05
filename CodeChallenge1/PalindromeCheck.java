import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String tempS = "";

        System.out.print("Enter the number: ");
        int numM = scn.nextInt();

        int num = numM;

        while (num != 0) {
            int tem = num % 10;
            tempS = tempS + String.valueOf(tem);
            num = num / 10;
        }

        if (Integer.parseInt(tempS) == numM) {
            System.out.println("Yes Palindrome!");
        } else {
            System.out.println("No Palindrome!");
        }

    }
}
