//************************************************************ 
// Telephone.java 
// 
// Uses the TelephonePanel class to create a (functionless) GUI 
// like a telephone keypad with a title. 
// Illustrates use of BorderLayout and GridLayout. 
//************************************************************ 
import javax.swing.*; 
/**
 * This is a program that creates a keypad GUI.
 * It uses the methods from Telephone.java to create a GUI.
 * @author Raly Tan
 * @version 1.0
 */
public class Telephone { 
    /**
     * This is the main method calld by the JVM.
     * @param args
     */
    public static void main(String[] args) { 
        
        JFrame frame = new JFrame("Telephone"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.getContentPane().add(new TelephonePanel()); 
        frame.pack(); frame.setVisible(true); 
    } 
} 
