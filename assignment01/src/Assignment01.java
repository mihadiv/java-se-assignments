import java.util.Scanner;

public class Assignment01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "\n Single - 1 \n Married Filing Jointly or Qualified Widow(er) - 2 " +
                        "\n Married Filing Separately - 3 \n Head of Household - 4"
        );
        System.out.println("\nChoose the number corresponding to your filing status:");
        int s = scanner.nextInt();

        System.out.println("\nEnter your income:");
        double i = scanner.nextDouble();

        switch (s) {

            case 1: {
                if (i < 0) {
                    System.out.println("\nThe income is invalid");
                } else if (i <= 8350) {
                    System.out.printf("\nYour tax is: %.2f ", i * 0.1);
                } else if (i <= 33950) {
                    System.out.printf("\nYour tax is: %.2f ", i * 0.15);
                } else if (i <= 82250) {
                    System.out.printf("\nYour tax is: %.2f ", i * 0.25);
                } else if (i <= 171550) {
                    System.out.printf("\nYour tax is: %.2f ", i * 0.28);
                } else if (i <= 372950) {
                    System.out.printf("\nYour tax is: %.2f ", i * 0.33);
                } else {
                    System.out.printf("\nYour tax is: %.2f ", i * 0.15);
                }
                break;
            }

            case 2: {
                if (i < 0) {
                    System.out.println("\nThe income is invalid");
                } else if (i <= 16700) {
                    System.out.printf("\nYour tax is: %.2f ", i * 0.1);
                } else if (i <= 67900) {
                    System.out.printf("\nYour tax is: %.2f ", i * 0.15);
                } else if (i <= 137050) {
                    System.out.printf("\nYour tax is: %.2f ", i * 0.25);
                } else if (i <= 208850) {
                    System.out.printf("\nYour tax is: %.2f ", i * 0.28);
                } else if (i <= 372950) {
                    System.out.printf("\nYour tax is: %.2f ", i * 0.33);
                } else {
                    System.out.printf("\nYour tax is: %.2f ", i * 0.15);
                }
                break;
            }

            case 3: {
                if (i < 0) {
                    System.out.println("\nThe income is invalid");
                } else if (i <= 8350) {
                    System.out.printf("\nYour tax is: %.2f ", i * 0.1);
                } else if (i <= 33950) {
                    System.out.printf("\nYour tax is: %.2f ", i * 0.15);
                } else if (i <= 68525) {
                    System.out.printf("\nYour tax is: %.2f ", i * 0.25);
                } else if (i <= 104425) {
                    System.out.printf("\nYour tax is: %.2f ", i * 0.28);
                } else if (i <= 186475) {
                    System.out.printf("\nYour tax is: %.2f ", i * 0.33);
                } else {
                    System.out.printf("\nYour tax is: %.2f ", i * 0.15);
                }
                break;
            }

            case 4: {
                if (i < 0) {
                    System.out.println("\nThe income is invalid");
                } else if (i <= 11950) {
                    System.out.printf("\nYour tax is: %.2f ", i * 0.1);
                } else if (i <= 45500) {
                    System.out.printf("\nYour tax is: %.2f ", i * 0.15);
                } else if (i <= 117450) {
                    System.out.printf("\nYour tax is: %.2f ", i * 0.25);
                } else if (i <= 190200) {
                    System.out.printf("\nYour tax is: %.2f ", i * 0.28);
                } else if (i <= 372950) {
                    System.out.printf("\nYour tax is: %.2f ", i * 0.33);
                } else {
                    System.out.printf("\nYour tax is: %.2f ", i * 0.15);
                }
                break;
            }
        }

        scanner.close();
    }
}