/**
 * A program that uses the RandomWalk class to create two 
 * objects and test whether they have collided.
 * 
 * @author Raly Tan
 * @version 1.0
 */
public class Collisions {

    /**
     * The size of the area the objects the can move in.
     */
    private static final int BOUNDARY = 2000000;
    
    /**
     * The maximum number of moves that each object can make.
     */
    private static final int MAX_STEPS = 100000;
    /**
     * The main method that gets called by the JVM.
     * @param args unused
     */
    public static void main(String[] args) {
        
        int par1StartX = -3;
        int par2StartX = 3;
        int collision = 0;
        
        RandomWalk particle1 = new RandomWalk(MAX_STEPS, BOUNDARY, par1StartX, 0);
        RandomWalk particle2 = new RandomWalk(MAX_STEPS, BOUNDARY, par2StartX, 0);
        
        for (int i = 0; i <= MAX_STEPS; i++) {
            particle1.walk();
            particle2.walk();
            if (samePosition(particle1, particle2)) {
                collision++;
            }
        }
        System.out.println("The number of times the particles collided "
                            + "is " + collision);
    }
    /**
     * A boolean to check whether the objects are at the same coordinates. 
     */
    public static boolean samePosition(RandomWalk particle1, RandomWalk particle2) {
        if (particle1.getX() == particle2.getX() && particle1.getY() == particle2.getY()) {
            return true;
        } else {
            return false;
        }
    }
}