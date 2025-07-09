package a05_4;

public class A05_4_Oop {

    public static void main(String[] args) {

        int[][] carKmPerDay = {
                {200, 150, 250, 180, 220},
                {120, 110, 130, 150, 140},
                {180, 190, 200, 170, 180},
                {250, 240, 230, 270, 250}
        };

        RentCars info = new RentCars(carKmPerDay);
        info.displayCarStatistics();
    }
}
