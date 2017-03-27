package Lab08;

/**
 * A  class that provides the methods for an object
 * that moves on a two-dimensional place.
 * @author Raly Tan
 * @version 1.0
 */
public class RandomWalk {

    /**
     * The current X coordinate.
     */
    private int currentX;
    /**
     * The current Y coordinate.
     */
    private int currentY;
    /**
     * The maximum number of steps.
     */
    private int maxSteps;
    /**
     * The current amount of steps taken.
     */
    private int currentSteps;
    /**
     * The size of the plane that can be moved in.
     */
    private int boundary;
    /**
     * The maximum distance.
     */
    private int maxDistance;
    
    /**
     * Primary constructor for an object that only contains
     * a maximum number of steps, and the boundary it can walk in.
     * @param max
     * @param edge
     */
    public RandomWalk(int max, int edge) {
        maxSteps = max;
        boundary = edge;
        currentX = 0;
        currentY = 0;
        currentSteps = 0;
        maxDistance = 0;
    }
    
    /**
     * Secondary constructor for an object that contains a 
     * maximum number of steps, the boundary it can walk in, 
     * and a starting x and y location on the plane.
     * @param max
     * @param edge
     * @param startX
     * @param startY
     */
    public RandomWalk(int max, int edge, int startX, int startY) {
        maxSteps = max;
        boundary = edge;
        maxDistance = 0;
        currentX = startX;
        currentY = startY;
    }
    
    /**
     * A method for generating a random direction to move in.
     */
    public void takeStep() {
        int genNum = (int) (Math.random() * 4);
        
        switch(genNum) {
        case 0: currentX++; //move right
                break;
        case 1: currentY++; //move up
                break;
        case 2: currentX--; //move left
                break;
        case 3: currentY--; //move down
                break;
        default: break; // Don't move
        }
        currentSteps++;
        maxDistance = max((Math.abs(currentX)), (Math.abs(maxDistance)));
        
    }
    
    /**
     * A method to check whether an object has more steps to take..
     * @return true false
     */
    boolean moreSteps() {
        
        if (currentSteps < maxSteps) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * To check whether or not the object is within the boundary.
     * @return true false
     */
    boolean inBounds() {
        
        if (Math.abs(currentX) <= boundary && Math.abs(currentY) <= boundary) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * A method to take a step as long as it has more steps to take
     * and it is within the boundary.
     */
    public void walk() {
        do {
            takeStep(); 
        } while(moreSteps() == true && inBounds() == true);
    }
    
    /**
     * Returns the current X location.
     * @return currentX
     */
    public int getX() {
        return currentX;
    }
    
    /**
     * Returns the current Y location.
     * @return currentY
     */
    public int getY() {
        return currentY;
    }
    
    /**
     * A method to check for max.
     * @param num1
     * @param num2
     * @return num1 num2
     */
    private int max(int num1, int num2) {
        if (num1 >= num2) {
            return num1;
        } else {
            return num2;
        }
    } 
    
    /**
     * Returns the maximum distance.
     * @return maxDistance
     */
    public int getMaxDistance() {
        return maxDistance;
    }
    
    /**
     * Main toString method that returns a string if the object is printed. 
     * @return String
     */
    public String toString() {
    return ("Steps: " + currentSteps + " Position: (" + currentX + "," + currentY + ")");
    }
}