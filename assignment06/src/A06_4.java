import robocode.*;

public class A06_4 extends Robot {

    public void run() {

        while (true) {
            for (int i = 0; i < 4; i++) {
                ahead(150);
                turnRight(90);
            }
        }
    }
}