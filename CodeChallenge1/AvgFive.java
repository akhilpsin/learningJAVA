import java.util.Scanner;

public class AvgFive {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float sum = 0;

        System.out.println("Input number: ");
        for (int i = 0; i < 5; i++) {
            int num1 = in.nextInt();
            sum = sum + num1;
        }

        System.out.print("Average: ");
        System.out.print(sum / 5);

    }

}
