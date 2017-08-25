package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  J. Liem
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void rearrangeBeepers() {
        pickUpBeepers();
        putBeepersHorizontally();
        moveFinalPosition();
    }
   
    
    public void turnAround() {
        turnLeft();
        turnLeft();
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void pickNextBeeper() {
        move();
        pickBeeper();
    }
    
    public void pickNext2Beepers() {
        pickNextBeeper();
        pickNextBeeper();
    }
    
    public void moveTwo() {
        move();
        move();
    }
    
    public void putNextBeeper() {
        move();
        putBeeper();
    }
    
    public void putNext2Beepers() {
        putNextBeeper();
        putNextBeeper();
    }
    
    public void pickUpBeepers() {
        moveTwo();
        pickBeeper();
        turnLeft();
        pickNext2Beepers();
        turnAround();
        moveTwo();
        pickNext2Beepers();
    }

    public void putBeepersHorizontally() {
        turnAround();
        moveTwo();
        putBeeper();
        turnLeft();
        putNext2Beepers();
        turnAround();
        moveTwo();
        putNext2Beepers();
    }
    
    public void moveFinalPosition() {
        turnAround();
        moveTwo();
        turnLeft();
        moveTwo();
        turnAround();
    }
}