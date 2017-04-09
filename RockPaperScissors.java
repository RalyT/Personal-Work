import java.util.Scanner;
import java.util.Random;
/**
 * <p>A program that runs a game of "Rock, Paper, Scissors"
 * This program simulates a computer's choice through the random
 * class and a switch. The user will input their choice and it will
 * clash against the computer's choice for a win or loss.  </p>
 *
 * @author Raly Tan, Set B
 * @version 1.0
 */
public class RockPaperScissors {
    
    /**
     * The maximum number of choices for the computer to choose.
     */
    private static final int MAX_RANDOM = 3;
    
    /**
     * The score for how many times the user wins.
     */
    private static int userWins;
    
    /**
     * The score for how many times the user loses.
     */
    private static int userLosses;
    
    /**
     * The score for how many times a tie happens.
     */
    private static int ties;
    
    /**
     * A method for generating a random choice for the computer.
     * @return computerChoice The randomized result for the computer.
     */
    public static String generatePlay() {
        
        Random generator = new Random();
        String computerChoice = "nothing";
        
        int computerRandom = generator.nextInt(MAX_RANDOM);
        switch (computerRandom) {
            case 0: computerChoice = "rock";
                break;
            case 1: computerChoice = "paper";
                break;
            case 2: computerChoice = "scissor";
                break;
            default: break; 
        }
        return computerChoice;
    }
    /**
     * A method for comparing the user's choice and computer's choice
     * and checking to see who wins or if they tied.
     * @param userPlay The choice that the user chose to play.
     * @param computerPlay The choice that the computer chose to play.
     */
    public static void whoWins(String userPlay, String computerPlay) {
        
        String userChoice = userPlay;
        String computerChoice = computerPlay;
        // Scenario if it's a tie
        if (userChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
            ties++;
        } else {
            //Scenarios if user chooses "rock"
            if (userChoice.equals("rock")) {
                if (computerChoice.equals("scissor")) {
                    System.out.println("Rock crushes scissor! You win!");
                    userWins++;
                } else {
                    System.out.println("Paper covers rock, you lose!");
                    userLosses++;
                }
            }
            //Scenarios if user chooses "paper"
            if (userChoice.equals("paper")) {
                if (computerChoice.equals("rock")) {
                    System.out.println("Paper covers rock! You Win!");
                    userWins++;
                } else {
                    System.out.println("Scissor cuts paper, you lose!");
                    userLosses++;
                    }
            }
            //Scenarios if user chooses "scissor"
            if (userChoice.equals("scissor")) {
                if (computerChoice.equals("paper")) {
                    System.out.println("Scissor cuts paper! You Win!");
                    userWins++;
                } else {
                    System.out.println("Rock crushes scissor, you lose!");
                    userLosses++;
                }
            }
        } 
    }
    
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        // your code will go here!!!
        Scanner scan = new Scanner(System.in);
        String playAgain = "yes";
        
        //Using a loop to restart the game if the user enters yes
        while (playAgain.equalsIgnoreCase("yes")) {
            System.out.println("Welcome to a game of Rock Paper Scissors! "
                                + "\nEnter \"no\" at the end to stop the game");
            System.out.println("Please enter \"rock\", \"paper\", "
                               + "or \"scissor\": ");
            String userChoice = scan.next();
            
            //Switching user's choice to lowercase to eliminate case sensitivity
            userChoice = userChoice.toLowerCase();
            //Uses the generatePlay method to randomize a choice for computer
            String computerChoice = generatePlay();
            
            System.out.println("You have chosen " + userChoice 
                                + "\nThe computer chooses " + computerChoice);
            whoWins(userChoice, computerChoice);

            //User chooses to end the game or restart
            System.out.println("Do you want to keep playing? YES/NO");
            playAgain = scan.next();
            }
        //Prints the user and computer scores
        System.out.println("_______Score_______"
                            + "\nYou won " + userWins + " times"
                            + "\nYou lost " + userLosses + " times."
                            + "\nThere were " + ties + " ties.");

        System.out.println("Question two was called and ran sucessfully.");
        }
};
