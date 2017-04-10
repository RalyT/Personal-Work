import java.util.Scanner;

/**
 * <p>This is a program that tests if an input is a palindrome.
 * By checking whether two characters at opposite ends of a string
 * are the same, we can verify if a word is a palindrome. We also 
 * use methods to ignore punctuation, whitespace and case sensitivity.</p>
 *
 * @author Raly Tan, Set B
 * @version 1.0
 */
public class PalindromeTester {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        // your code will go here!!!
        Scanner scan = new Scanner(System.in);
        
        System.out.println("_____Palindrome Tester_____");
        System.out.println("Please enter a word to test:");
        String word = scan.nextLine();

        //Change all characters to lower case to ignore case sensitivity
        word = word.toLowerCase();
        // Eliminates all non-word characters,punctuation and spaces
        word = word.replaceAll("\\W", "");
        
        //Variable left set to start from the beginning of the string
        int left = 0;
        //Variable right set to start from the end of the string
        int right = word.length() - 1;

        //While the characters at the start and end are the same,
        //continue checking the next character moving inwards
        while (left < right && word.charAt(left) == word.charAt(right)) {
            left++;
            right--;
        }
        //If left is greater than right, that means they hit the center and 
        //passed each other in the word, so it is a palindrome.
        if (left < right) {
            System.out.println("The word is not a palindrome.");
        } else {
            System.out.println("The word is a palindrome!");
            }
        
        System.out.println("Question one was called and ran sucessfully.");
    }
};
