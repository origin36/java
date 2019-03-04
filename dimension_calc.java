/*******************************************************
* WightDanielUnit3.java
* Daniel Wight
*
* This program calculates the dimensions of a doughnut
*******************************************************/

import java.util.Scanner;
import java.awt.image.BufferedImage;

public class WightDanielUnit3
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);

		String company;                           //name of doughnut manufacturer
		int a;                                    //internal doughnut radius
		int b;                                    //external doughnut radius
		double density;                           //doughnut density
		double volume;                            //doughnut volume

		System.out.println("Enter Doughnut Company:");
		company = stdIn.next();

		System.out.println(
			"Enter internal radius (a) in inches (integer number). " +
			"Note: The internal radius (a) is the radius of the hole in the doughnut, " +
			"from the empty center to its internal wall.");
		a = stdIn.nextInt();

		System.out.println(
			"Enter external radius (b) in inches (integer number). " +
			"Note: The external radius is the radius of the complete doughnut, from the " +
			"empty center to its external wall.");
		b = stdIn.nextInt();

		if (a >= b)         //condition that does not exist
		{
			System.out.println("Error: External radius must be larger than internal radius");
		}

		else                //computations only on correctly input values
		{
			System.out.println("Enter density in gr/cc (a decimal number between 0.1 and 1.5).");
			density = stdIn.nextDouble();

			volume = ((Math.PI * Math.PI *(a + b) * (b - a)*(b - a)) / 4);

			System.out.println("Your " + company + " Doughnut has the following dimensions:");

			System.out.println("The small circumference is " + (a * 2 * Math.PI) + " inches-long");

			System.out.println("The big circumberence is " + (b * 2 * Math.PI) + " inches-long");

			System.out.println("The surface area is " + ((Math.PI * Math.PI) * ((b * b) - (a * a))) + " square inches");

			System.out.println("The volume is " + volume + " cubic inches");

			System.out.println("The cross area is " + ((Math.PI * (b - a)*(b - a)) / 4) + " square inches");

			System.out.println("The weight is " + (0.03609485 * density * volume) + " pounds");
		}

	}  //End of main
}