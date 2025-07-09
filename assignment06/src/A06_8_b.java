import robocode.*;

public class A06_8_b extends Robot {

    private int squaresNo = 0;
    private boolean aggressive = true;
    private boolean scanForRobots = true;

    public void run() {

        while (true) {
            moveInSquare(150);
        }
    }

    public void moveInSquare(int lengthOfSide) {

        for (int i = 0; i < 4;i++){
            ahead(lengthOfSide);
            turnRight(90);
            squaresNo++;
            if(aggressive){
                fire(1);
            }
            if(scanForRobots){
                turnRadarRight(360);
            }
        }
    }
}
