import robocode.*;

public class A06_5 extends Robot {

    private int squaresNo = 0;

    public void run() {

        while (true) {
            for (int i = 0; i < 4; i++) {
                ahead(150);
                turnRight(90);

                squaresNo++;
            }

            System.out.println("The robot has traveled "+ squaresNo + " squares ");
        }
    }
}