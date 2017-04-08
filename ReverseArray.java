import java.util.Scanner;

/**
 * A program that instantiates a numbero of objects in an 
 * array depending on user input. Then reverses the values
 * stored in the array from first to last value.
 * @author Raly Tan
 * @version 1.0
 */
public class ReverseArray {

    /**
     * The main method that gets called by the JVM.
     * @param args unused.
     */
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a number of values: ");
        int numValues = scan.nextInt();
        
        //Creating the array object with a user set amount of values
        int[] array = new int[numValues];
        //Scans and stores numbers into every array value.
        for (int i = 0; i < numValues; i++) {
            System.out.println("Please enter" + numValues + "integers with a space:");
            array[i] = scan.nextInt();
        }
        //Prints out the objects in the array and their values
        System.out.println("___Values of the Array___");
        for (int i = 0; i < numValues; i++) {
            System.out.println("Object " + (i + 1) + " has a value of " + array[i]);
        }
        
        //Reversing the stored values in the array from first to last value
        for (int i = 0; i < numValues / 2; i++) {
            int temp = array[i];
            array[i] = array[(array.length - 1) - i];
            array[(numValues - 1) - i] = temp;
        }
        //Printing out the reversed array.
        System.out.println("____Reversed Array____");
        for (int i = 0; i < numValues; i++) {
            System.out.println("Object " + (i + 1) + " has a value of " + array[i]);
        }
    }
}
