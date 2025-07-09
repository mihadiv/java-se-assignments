package a05_2;

public class A05_2_Oop {

    public static void main(String[] args) {

        int[] screenTimePerDay = {
                120, 150, 140, 180, 160, 200, 190, 210, 170,
                160, 140, 130, 120, 150, 140, 180, 190,
                200, 170, 160, 140, 150, 160, 170, 180, 190, 130
        };

        ScreenTime screenTimeTracker = new ScreenTime(screenTimePerDay);

        screenTimeTracker.printMinTime();
        screenTimeTracker.printMaxTime();
    }
}
