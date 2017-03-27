package Lab08;

//************************************************************ 
//  TestWalk.java 
// 
//  Program to test methods in the RandomWalk class. 
// ************************************************************ 
import java.util.Scanner; 

/**
 * This is a program that uses the RandomWalk class to generate
 * three objects that move in a random direction. Two objects 
 * have preset values and the third object takes in user input.
 * It then prints out the 
 * 
 * @author Raly Tan
 * @version 1.0
 */
public class TestWalk { 
    
    /**
     * The main method that gets executed by the JVM.
     * @param args
     */
    public static void main (String[] args) { 
        
        // maximum number of steps in a walk 
        int maxSteps; 
        // the maximum x and y coordinate 
        int maxCoord; 
        // starting x and y coordinates for a walk 
        int x; 
        int y; 
        
        //Variables for User inputs
        int steps = 0;
        
        //Object with 10 maximum steps and a boundary of 5
        RandomWalk obj1 = new RandomWalk(10, 5);
        //Object with 200 maximum steps and 10 boundary
        RandomWalk obj3 = new RandomWalk(200, 10);
        
        Scanner scan = new Scanner(System.in); 
        
        System.out.println("\nRandom Walk Test Program"); 
        System.out.print("\nEnter the boundary for the square: "); 
        int boundary = scan.nextInt(); 
        System.out.print("Enter the maximum number of steps: "); 
        maxSteps = scan.nextInt(); 
        System.out.print("Enter the starting x and y coordinates with " 
                         + "a space between: "); 
        x = scan.nextInt(); 
        y = scan.nextInt();  
        
        //Object with user input data
        RandomWalk obj2 = new RandomWalk(steps, boundary);
        //Objects 1 and 3 both take 5 steps
        for (int i = 0; i < 5; i++) {
            obj1.takeStep();
            obj3.takeStep();
            }
        //Object 2 takes the user inputed amount of steps
        for (int i = 0; i < maxSteps; i++) {
            obj2.walk();
        }
        
        System.out.println("Object 1: " + obj1);
        System.out.println("Object 2: " + obj2);
        System.out.println("Object 3: " + obj3);
        
        System.out.println(obj1.getMaxDistance());
        System.out.println(obj2.getMaxDistance());
        System.out.println(obj3.getMaxDistance());
    } 
} 