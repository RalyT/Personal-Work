package Lab08;
import java.util.Scanner;

/**
 * This is a program that uses the RandomWalk class to 
 * generate objects that move in random directions, and 
 * records how many objects move out of bounds. 
 * The user can enter the number of objects, moves, and
 * size of boundary. 
 * 
 * @author Raly Tan 
 * @version 1.0
 */
public class DrunkenWalk {

    /**
     * The main method that gets called by the JVM.
     * @param args unused.
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int boundary;
        int maxSteps;
        int quantity;
        int outOfBounds = 0;
        
        System.out.println("What is the boundary of the platform: ");
        boundary = scan.nextInt();
        System.out.println("What is the maximum steps for them to take: ");
        maxSteps = scan.nextInt();
        System.out.println("How many drunks are there: ");
        quantity = scan.nextInt();
        
        for (int i = 0; i < quantity; i++) {
            RandomWalk walk = new RandomWalk(maxSteps, boundary);
            walk.walk();
            if (walk.inBounds() == false) {
                outOfBounds++;
            }
        }
        System.out.println("The number of drunks that fell off are " 
                            + outOfBounds);
        

    }
}
    
