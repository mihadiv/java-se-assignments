import java.util.Random;

public class Assignment03 {

    public static void main(String[] args) {

        int[] numbers = new int[100];
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            numbers[i] = random.nextInt(100);
        }

        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += numbers[i];
        }

        int average = sum / 100;
        System.out.println("\nThe average is: " + average);

        int countAboveAverage = 0;
        for (int i = 0; i < 100; i++) {
            if (numbers[i] > average) {
                countAboveAverage++;
            }
        }

        System.out.println(countAboveAverage + " numbers are greater than the average.");
    }
}