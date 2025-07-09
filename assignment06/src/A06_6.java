import robocode.*;

public class A06_6 extends Robot {

    private int squaresNo = 0;
    private boolean clockwise = true;

    public void run() {

        while (true) {

            ahead(150);

            if (squaresNo % 2 == 0) {
                turnRight(90);
                clockwise = true;
            } // clockwise
            else {
                turnLeft(90);
                clockwise = false;
            } // anti-clockwise

            squaresNo++;

            if (clockwise) {
                System.out.println("The robot is currently traveling clockwise.");
            } else {
                System.out.println("The robot is currently traveling anti-clockwise.");
            }

        }
    }
}
