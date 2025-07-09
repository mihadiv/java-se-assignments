package a05_2;

public class ScreenTime {

    private int[] screenTimePerDay;

    public ScreenTime(int[] screenTimePerDay) {
        this.screenTimePerDay = screenTimePerDay;
    }

    public int[] getScreenTimePerDay() {
        return screenTimePerDay;
    }

    public void setScreenTimePerDay(int[] screenTimePerDay) {
        this.screenTimePerDay = screenTimePerDay;
    }

    public void printMinTime() {

        int minScreenTime = screenTimePerDay[0];
        int minDay = 1;

        for (int i = 1; i < screenTimePerDay.length; i++) {
            if (screenTimePerDay[i] < minScreenTime) {
                minScreenTime = screenTimePerDay[i];
                minDay = i + 1;
            }
        }

        System.out.println(
                "\nThe shortest screen-time was " + minScreenTime +
                        " minutes, on day " + minDay + "."
        );
    }

    public void printMaxTime() {

        int maxScreenTime = screenTimePerDay[0];
        int maxDay = 1;

        for (int i = 1; i < screenTimePerDay.length; i++) {
            if (screenTimePerDay[i] > maxScreenTime) {
                maxScreenTime = screenTimePerDay[i];
                maxDay = i + 1;
            }
        }

        System.out.println(
                "\nThe longest screen-time was " + maxScreenTime +
                        " minutes, on day " + maxDay + "."
        );
    }
}