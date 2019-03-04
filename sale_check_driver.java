/*******************************************************************************
 * WDUnit6Ch15.java
 * Daniel Wight
 *
 * Program that validates a sale in dollars and cents with a $ and .(period).
 ******************************************************************************/

import java.util.Scanner;
/**
 *
 * @author Daniel J Wight
 */
public class WDUnit6Ch15 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter amount of sale in form $#.## (q to quit): ");
        String sale = keyboard.next(); //sale input
        while(!sale.equalsIgnoreCase("q")){ //execute until input equals q
            WDSaleCheck saleCheck = new WDSaleCheck(sale); //declaration, instatiation, and initialization of saleCheck with sale argument
            if(saleCheck.getErrorMsg() == null){ //execute if no errors present in WDSaleCheck constructor
                saleCheck.printNumeric(); //print numeric sale
                saleCheck.printAlphabetic(); //print alphabetic sale
            } //end if
            else{
                System.out.print(saleCheck.getErrorMsg().replace("null", "")); //print errors, erasing null from the strings
            } //end else
            System.out.print("\nPlease enter amount of sale in form $#.## (q to quit): ");
            sale = keyboard.next();
        } //end while
    } //end main
} //end class