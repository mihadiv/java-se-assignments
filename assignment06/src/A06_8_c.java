import robocode.*;

public class A06_8_c extends Robot {

    private int squaresNo = 0;
    private boolean aggressive = true;
    private boolean clockwise = true;
    private int squareSize = 150;
    private int gunTurnDegrees = 20;
    private int radarTurnDegrees = 45;
    private boolean scanForRobots = true;

    public void run() {

        while (true) {
            moveInSquare();
        }
    }

    public void moveInSquare() {

        for (int i = 0; i < 4;i++){
            ahead(squareSize);
            squaresNo++;
            if (squaresNo % 2 == 0) {
                turnRight(90);
                clockwise = true;
            }
            else {
                turnLeft(90);
                clockwise = false;
            }

            if(aggressive){
                fire(1);
            }
            if(scanForRobots){
                turnRadarRight(radarTurnDegrees);
                turnGunRight(gunTurnDegrees);
            }
        }
    }
}
