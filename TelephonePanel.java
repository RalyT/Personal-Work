package Lab09;

//************************************************************ 
// TelephonePanel.java 
// 
// Lays out a (functionless) GUI like a telephone keypad with a title. 
// Illustrates use of BorderLayout and GridLayout. 
//************************************************************ 
import java.awt.*; 
import javax.swing.*; 

public class TelephonePanel extends JPanel { 
    
    //private JTextArea keyPad;
    
    public TelephonePanel() { 
        //set BorderLayout for this panel 
        setLayout(new BorderLayout());
        //create a JLabel with "Your Telephone" title 
        JPanel centerTitle = new JPanel();
        JLabel title = new JLabel("Your Telephone");
        //add title label to north of this panel 
        add(centerTitle, BorderLayout.NORTH);
        centerTitle.add(title);
        //create panel to hold keypad and give it a 4x3 GridLayout 
        GridLayout layout = new GridLayout(4, 3);
        //add buttons representing keys to key panel 
        JPanel keyPad = new JPanel(layout);
        
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton button10 = new JButton("*");
        JButton button11 = new JButton("0");
        JButton button12 = new JButton("#");
        
        keyPad.add(button1);
        keyPad.add(button2);
        keyPad.add(button3);
        keyPad.add(button4);
        keyPad.add(button5);
        keyPad.add(button6);
        keyPad.add(button7);
        keyPad.add(button8);
        keyPad.add(button9);
        keyPad.add(button10);
        keyPad.add(button11);
        keyPad.add(button12);
        //add key panel to center of this panel } } 
        add(keyPad, BorderLayout.CENTER);
    }
}