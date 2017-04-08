/**
 * A game that generates a number and asks the user to guess.
 * 
 * @author Raly Tan
 * @version 1.0
 */
import java.util.Scanner;
import java.util.Random;

public class MoreGuessing {
        
    /**
     * The total number of possible choices.
     */
    private static final int MAX = 10;
    /**
     * The main method that gets called by the JVM.
     * @param args unused
     */
    public static void main(String[] args) {
        //Number the user tries to guess
        int numToGuess; 
        //The user's guess
        int guess; 
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        
        do {
            numToGuess = generator.nextInt(MAX) + 1;
            System.out.println("Pick a number between 1 - 10:");
            guess = scan.nextInt();
            if (guess == numToGuess) {
                System.out.println("The number is " + numToGuess + "\nYou guessed Correct!");
            } else {
                System.out.println("The number is " + numToGuess + "\nTry again.");
            }
        }
        //The program keeps going as long as the guess is wrong
        while (guess != numToGuess);
        }
}