import robocode.*;

public class A06_7 extends Robot {

    private int squaresNo = 0;

    public void run() {

        while (true) {
            moveInSquare(150);
            System.out.println("The robot has traveled " + squaresNo + " squares ");
        }
    }

    public void moveInSquare(int lengthOfSide) {

        for (int i = 0; i < 4;i++){
            ahead(lengthOfSide);
            turnRight(90);
            squaresNo++;
        }
    }
}



