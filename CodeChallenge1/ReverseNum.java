import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = scn.nextInt();

        System.out.print("Reveresed: ");
        while (num != 0) {
            int tem = num % 10;
            System.out.print(tem);
            num = num / 10;

        }
    }
}
