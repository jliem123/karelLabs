package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  J. Liem
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void shuttleRace() {
        turnLeft();
        turnRightCorner();
        turnNextRight();
        makeTopLoop();
        finishFigure8();
    }
   
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void turnLeftCorner() {
        move();
        move();
        turnLeft();
    }
    
    public void turnRightCorner() {
        move();
        turnRight();
    }
    
    public void turnNextRight() {
        move();
        turnRightCorner();
    }
    public void makeTopLoop() {
        turnLeftCorner();
        turnLeftCorner();
        turnLeftCorner();
        turnLeftCorner();
    }
    
    public void finishFigure8() {
        turnNextRight();
        turnNextRight();
        move();
        turnRight();
    }
}