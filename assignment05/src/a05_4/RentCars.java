package a05_4;

public class RentCars {

    private int[][] carKmPerDay;

    public RentCars(int[][] carKmPerDay) {
        this.carKmPerDay = carKmPerDay;
    }

    public int[][] getCarKmPerDay() {
        return carKmPerDay;
    }

    public void setCarKmPerDay(int[][] carKmPerDay) {
        this.carKmPerDay = carKmPerDay;
    }

    public void displayCarStatistics() {
        int n = carKmPerDay.length;
        int m = carKmPerDay[0].length;

        for (int i = 0; i < n; i++) {
            int totalKm = 0;

            for (int j = 0; j < m; j++) {
                totalKm += carKmPerDay[i][j];
            }

            double averageKmPerDay = (double) totalKm / m;

            int minKmPerDay = carKmPerDay[i][0];
            int maxKmPerDay = carKmPerDay[i][0];

            for (int j = 1; j < m; j++) {
                if (carKmPerDay[i][j] < minKmPerDay) {
                    minKmPerDay = carKmPerDay[i][j];
                }
                if (carKmPerDay[i][j] > maxKmPerDay) {
                    maxKmPerDay = carKmPerDay[i][j];
                }
            }

            System.out.println("\nCar " + (i + 1) + " had an average of " + averageKmPerDay + " km per day.");
            System.out.println("Minimum km in a day: " + minKmPerDay);
            System.out.println("Maximum km in a day: " + maxKmPerDay);
        }
    }
}