package a05_1;

public class A05_1_Oop {

    public static void main(String[] args) {

        GasConsume car = new GasConsume(new double[]{30, 14, 21, 9}, 7.4, 3);

        System.out.printf("\nThe overall consume in liters is: %.2f \n", car.getLitersConsume());
        System.out.printf("The overall consume in money is: %.2f \n", car.getMoneyConsume());

        System.out.printf("The average consume in liters is: %.2f \n", car.getLitersConsume() / car.getNoDays());
        System.out.printf("The average consume in money is: %.2f \n", car.getMoneyConsume() / car.getNoDays());

    }
}