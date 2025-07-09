import robocode.*;

public class A06_3 extends Robot {

    public void run() {

        for (int i = 0; i < 4; i++) {
            //Move forward
            ahead(150);
            //Turn right
            turnRight(90);

        }
    }
}