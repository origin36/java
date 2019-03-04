/*******************************************************************************
 * WDUnit7Ch17.java
 * Daniel Wight
 *
 * Program that displays dialog box with random colors.
 ******************************************************************************/

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
/**
 *
 * @author Daniel J Wight
 */
public class WDUnit7Ch17 extends JFrame{
    private static final int WIDTH = 600; //width of JFrame
    private static final int HEIGHT = 250; //height of JFrame
    private static final int LOCATIONX = 600; //X location of JFrame on screen
    private static final int LOCATIONY = 350; //Y location of JFrame on screen
    private static final List<Color> colors = Arrays.asList(Color.RED, Color.WHITE, Color.YELLOW, Color.GREEN, Color.BLUE); //array of colors used
    private final Random random = new Random(); //random declaration and instantiation

    public WDUnit7Ch17(){ //default values for new JFrame
        setTitle("Color Changing Frame"); //sets title of JFrame
        setSize(WIDTH, HEIGHT); //sets size and height of JFrame
        setLayout(new FlowLayout()); //sets new default layout
        setDefaultCloseOperation(EXIT_ON_CLOSE); //closes JFrame upon user clicking 'X'
        setLocation(LOCATIONX, LOCATIONY); //sets horizontal and vertical screen location of JFrame
        getContentPane().setBackground(colors.get(random.nextInt(5))); //assign random color to background
        createContents(); //creates JFrame with createContents() method
        setVisible(true); //makes JFraome visible
    } // end WDUnit7Ch17 constructor
    private void createContents(){ //sets the contents of JFrame
        JButton button = new JButton("Random"); //declaration, instantiation, and creation of JButton
        Listener listener = new Listener(); //declaration and instantiation of listener
        add(button); //add button to JFrame
        button.addActionListener(listener); //add listener to button
    } // end createContents
    private class Listener implements ActionListener{ //implementation of superclass ActionListener
        @Override
        public void actionPerformed(ActionEvent e){ //sets up action performed method
            getContentPane().setBackground(colors.get(random.nextInt(5))); //assign random color to background
        } //end actionPerformed
    } //end class Listener implements ActionListener
    public static void main(String[] args){
        JLabel startupMessage = new JLabel("<html><div style='text-align: center;'>" +
                "The following window color will be randomly chosen from<br>" +
                "Red, White, Yellow, Green, Blue<br>Every time the button is " +
                "pressed.</html>", SwingConstants.CENTER); //set up contents of initial message
        JOptionPane.showMessageDialog(null, startupMessage); //display initial message
        WDUnit7Ch17 colorChangingJFrame = new WDUnit7Ch17(); //display color changing JFrame WDUnit7Ch17
    } //end main
} //end class