/*******************************************************************************
 * WDUnit8Ch18.java
 * Daniel Wight
 *
 * Program with randomly placed buttons that change pane color when pressed.
 ******************************************************************************/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author Daniel J Wight
 */
public class WDUnit8Ch18 extends JFrame{
    private static final int WIDTH = 600; //width of JFrame
    private static final int HEIGHT = 250; //height of JFrame
    private static final int LOCATIONX = 600; //X location of JFrame on screen
    private static final int LOCATIONY = 350; //Y location of JFrame on screen
    private final Random random = new Random(); //random declaration and instantiation
    private int randomNumber;

    public WDUnit8Ch18(){
        setTitle("Color Changing Frame"); //sets title of JFrame
        setSize(WIDTH, HEIGHT); //sets size and height of JFrame
        setLayout(new FlowLayout()); //sets new default layout
        setDefaultCloseOperation(EXIT_ON_CLOSE); //closes JFrame upon user clicking 'X'
        setLocation(LOCATIONX, LOCATIONY); //sets horizontal and vertical screen location of JFrame
        createContents(); //creates JFrame with createContents() method
        setVisible(true); //makes JFraome visible
    }
    private void createContents(){ //sets the contents of JFrame
        ArrayList<String> colorName = new ArrayList(){{ //ArrayList of color names
            add("Red");
            add("Blue");
            add("Yellow");
            add("Green");
            add("White");
        }};
        ArrayList<Color> colors = new ArrayList(){{ //Arraylist of colors
            add(Color.RED);
            add(Color.BLUE);
            add(Color.YELLOW);
            add(Color.GREEN);
            add(Color.WHITE);
        }};
        for(int i = 5; i > 0; i--){ //create a button for each color
            randomNumber = random.nextInt(i);
            JButton button = new JButton(colorName.remove(randomNumber));
            Listener listener = new Listener(colors.remove(randomNumber));
            add(button);
            button.addActionListener(listener);
        }
    }
    private class Listener implements ActionListener{ //implementation of superclass ActionListener
        private final Color backgroundColor;
        public Listener(Color backgroundColor){ //Listener constructor with random number arguement
            this.backgroundColor = backgroundColor;
        }
        @Override
        public void actionPerformed(ActionEvent e){ //sets up action performed method
            getContentPane().removeAll(); //clear current content pane
            getContentPane().setBackground(backgroundColor); //assign button color to background
            createContents(); //perform method createContents
            setVisible(true); //make JFrame visible
        } //end actionPerformed
    } //end class Listener implements ActionListener
    public static void main(String[] args) {
        new WDUnit8Ch18(); //create new JFrame
    } //end main
} //end class