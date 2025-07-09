package a05_1;

public class A05_1_NonOop {

    public static void main(String[] args) {

        double[] liters = {16, 23, 10, 27, 18};
        double cost = 6.4;
        int noDays = 5;

        double totalLiters = 0.0;
        double totalCost = 0.0;

        for (int i = 0; i < noDays; i++) {
            totalLiters += liters[i];
            totalCost += liters[i] * cost;
        }

        System.out.printf("\nThe overall consume in liters is: %.2f \n", totalLiters);
        System.out.printf("The overall consume in money is: %.2f \n", totalCost);

        System.out.printf("The average consume in liters is: %.2f \n", totalLiters / noDays);
        System.out.printf("The average consume in money is: %.2f \n", totalCost / noDays);

    }
}