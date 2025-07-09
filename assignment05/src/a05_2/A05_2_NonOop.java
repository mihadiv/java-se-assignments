package a05_2;

public class A05_2_NonOop {

    public static void main(String[] args) {

        int[] screenTimePerDay = {
                120, 150, 140, 180, 160, 200, 190, 210, 170,
                160, 140, 130, 120, 150, 140, 180, 190,
                200, 170, 160, 140, 150, 160, 170, 180, 190, 130
        };
        int minScreenTime = screenTimePerDay[0];
        int maxScreenTime = screenTimePerDay[0];
        int minDay = 1;
        int maxDay = 1;

        for (int i = 1; i < screenTimePerDay.length; i++) {

            if (screenTimePerDay[i] < minScreenTime) {
                minScreenTime = screenTimePerDay[i];
                minDay = i + 1;
            }

            if (screenTimePerDay[i] > maxScreenTime) {
                maxScreenTime = screenTimePerDay[i];
                maxDay = i + 1;
            }
        }

        System.out.println(
                "\nThe shortest screen time was " + minScreenTime +
                        " minutes, on day " + minDay + "."
        );
        System.out.println(
                "\nThe longest screen time was " + maxScreenTime +
                        " minutes, on day " + maxDay + "."
        );
    }
}
