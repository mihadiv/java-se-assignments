package a05_4;

public class A05_4_NonOop {

    public static void main(String[] args) {

        int[][] carKmPerDay = {
                {200, 150, 250, 180, 220, 200},
                {120, 110, 100, 130, 150, 140},
                {180, 190, 200, 170, 160, 180},
                {250, 240, 260, 230, 270, 250}
        };

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
            System.out.println("Minimum km in one day: " + minKmPerDay);
            System.out.println("Maximum km in one day: " + maxKmPerDay);
        }
    }
}
