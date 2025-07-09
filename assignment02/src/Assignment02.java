import java.util.Scanner;

public class Assignment02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter the number to start the multiplication from:");
        int start = scanner.nextInt();

        System.out.println("\nEnter the number up to which the multiplication should be performed:");
        int end = scanner.nextInt();

        while (start <= end) {
            for (int i = 1; i <= 10; i++) {
                System.out.printf(" %d * %d = %d \n", start, i, start * i);
            }
            start++;
            System.out.println();
        }

        scanner.close();
    }
}