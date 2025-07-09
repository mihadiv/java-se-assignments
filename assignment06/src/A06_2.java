import robocode.*;

public class A06_2 extends Robot {

    public void run() {

        for (int i = 0; i < 10; i++) {
            //first side
            ahead(150);
            turnRight(90);
            //second side
            ahead(150);
            turnRight(90);
            //third side
            ahead(150);
            turnRight(90);
            //fourth side
            ahead(150);
            turnRight(90);
        }
    }
}