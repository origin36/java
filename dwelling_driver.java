/*******************************************************
*WightDanielWeek6Prog.java
*Daniel Wight
*
*Program that compares dwelling values
*******************************************************/

import java.util.Scanner;

public class WightDanielWeek6Prog
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);

		String name;  //name of dwelling for input reference
		String category;  //type of Dwelling
		int numberOfBedrooms;  //number of bedrooms in Dwelling
		double numberOfBathrooms;   //number of bathrooms in Dwelling
		double area;  //area of Dwelling
		boolean centralAirCond;  //boolean of whether Dwelling has AC

		Dwelling dwelling1, dwelling2, dwelling3;  //declaration of reference variables

//display and input dwelling1 values

		dwelling1 = new Dwelling();  //instantiation of dwelling1
		System.out.print("Enter the name of Dwelling1: ");
		category = stdIn.next();
		dwelling1.setCategory(category);
		dwelling1.printLn1();
		numberOfBedrooms = stdIn.nextInt();
		dwelling1.printLn2();
		numberOfBathrooms = stdIn.nextDouble();
		dwelling1.printLn3();
		area = stdIn.nextDouble();
		dwelling1.printLn4();
		centralAirCond = stdIn.nextBoolean();

//dwelling 1 initialization

		dwelling1.setNumberOfBedrooms(numberOfBedrooms);
		dwelling1.setNumberOfBathrooms(numberOfBathrooms);
		dwelling1.setArea(area);
		dwelling1.setCentralAirCond(centralAirCond);

//display and input dwelling2 values

		dwelling2 = new Dwelling();  //instantiation of dwelling2
		System.out.print("Enter the name of Dwelling2: ");
		category = stdIn.next();
		dwelling2.setCategory(category);
		dwelling2.printLn1();
		numberOfBedrooms = stdIn.nextInt();
		dwelling2.printLn2();
		numberOfBathrooms = stdIn.nextDouble();
		dwelling2.printLn3();
		area = stdIn.nextDouble();
		dwelling2.printLn4();
		centralAirCond = stdIn.nextBoolean();

//dwelling 2 initialization

		dwelling2.setNumberOfBedrooms(numberOfBedrooms);
		dwelling2.setNumberOfBathrooms(numberOfBathrooms);
		dwelling2.setArea(area);
		dwelling2.setCentralAirCond(centralAirCond);

//display and input dwelling 3 values

		dwelling3 = new Dwelling();  //instantiation of dwelling1
		System.out.print("Enter the name of Dwelling3: ");
		category = stdIn.next();
		dwelling3.setCategory(category);
		dwelling3.printLn1();
		numberOfBedrooms = stdIn.nextInt();
		dwelling3.printLn2();
		numberOfBathrooms = stdIn.nextDouble();
		dwelling3.printLn3();
		area = stdIn.nextDouble();
		dwelling3.printLn4();
		centralAirCond = stdIn.nextBoolean();

//dwelling 3 initialization

		dwelling3.setNumberOfBedrooms(numberOfBedrooms);
		dwelling3.setNumberOfBathrooms(numberOfBathrooms);
		dwelling3.setArea(area);
		dwelling3.setCentralAirCond(centralAirCond);

//calculate average area, minimum bathrooms, maximum bathrooms, and determine house with AC that has most bedrooms

		double avgArea = (dwelling1.getArea() + dwelling2.getArea() + dwelling3.getArea()) / 3;
		double bathroomMin = Math.min(dwelling1.getNumberOfBathrooms(), Math.min(dwelling2.getNumberOfBathrooms(), dwelling3.getNumberOfBathrooms()));
		double bathroomMax = Math.max(dwelling1.getNumberOfBathrooms(), Math.max(dwelling2.getNumberOfBathrooms(), dwelling3.getNumberOfBathrooms()));
		int bedroomMax = Math.max(dwelling1.getNumberOfBedrooms(), Math.max(dwelling2.getNumberOfBedrooms(), dwelling3.getNumberOfBedrooms()));

		System.out.printf("The Dwellings average area is %.2f sq.ft.\n", avgArea);
		System.out.print("The Dwellings minimum number of bathrooms is: " + bathroomMin + "\n");
		System.out.print("The Dwellings maximum number of bathrooms is: " + bathroomMax + "\n");

		if (!dwelling1.getCentralAirCond() && !dwelling2.getCentralAirCond() && !dwelling3.getCentralAirCond())
		{
			System.out.print("Did the power go off?\nNone of the dwellings have AC!\n");
		}
		else if (!dwelling1.getCentralAirCond() && !dwelling2.getCentralAirCond())
		{
			System.out.print("The only Dwelling with AC is: " + dwelling3.getCategory() + "\n");
		}
		else if (!dwelling1.getCentralAirCond() && !dwelling3.getCentralAirCond())
		{
			System.out.print("The only Dwelling with AC is: " + dwelling2.getCategory() + "\n");
		}
		else if (!dwelling2.getCentralAirCond() && !dwelling3.getCentralAirCond())
		{
			System.out.print("The only Dwelling with AC is: " + dwelling1.getCategory() + "\n");
		}
		else if (!dwelling1.getCentralAirCond())
		{
			if (dwelling2.getNumberOfBedrooms() > dwelling3.getNumberOfBedrooms())
			{
				System.out.print("The Dwelling with AC and the most bedrooms is: " + dwelling2.getCategory() + "\n");
			}
			else if (dwelling2.getNumberOfBedrooms() < dwelling3.getNumberOfBedrooms())
			{
				System.out.print("The Dwelling with AC and the most bedrooms is: " + dwelling3.getCategory() + "\n");
			}
			else
			{
				System.out.print(dwelling2.getCategory() + " and " + dwelling3.getCategory() + " both have AC and the same number of bedrooms.\n");
			}
		}
		else if (!dwelling2.getCentralAirCond())
		{
			if (dwelling1.getNumberOfBedrooms() > dwelling3.getNumberOfBedrooms())
			{
				System.out.print("The Dwelling with AC and the most bedrooms is: " + dwelling1.getCategory() + "\n");
			}
			else if (dwelling1.getNumberOfBedrooms() < dwelling3.getNumberOfBedrooms())
			{
				System.out.print("The Dwelling with AC and the most bedrooms is: " + dwelling3.getCategory() + "\n");
			}
			else
			{
				System.out.print(dwelling1.getCategory() + " and " + dwelling3.getCategory() + " both have AC and the same number of bedrooms.\n");
			}
		}
		else if (!dwelling3.getCentralAirCond())
		{
			if (dwelling1.getNumberOfBedrooms() > dwelling2.getNumberOfBedrooms())
			{
				System.out.print("The Dwelling with AC and the most bedrooms is: " + dwelling1.getCategory() +"\n");
			}
			else if (dwelling1.getNumberOfBedrooms() < dwelling2.getNumberOfBedrooms())
			{
				System.out.print("The Dwelling with AC and the most bedrooms is: " + dwelling2.getCategory() + "\n");
			}
			else
			{
				System.out.print(dwelling1.getCategory() + " and " + dwelling2.getCategory() + " both have AC and the same number of bedrooms.\n");
			}
		}
		else if (bedroomMax > dwelling1.getNumberOfBedrooms() && dwelling2.getNumberOfBedrooms() == dwelling3.getNumberOfBedrooms())
		{
			System.out.print(dwelling1.getCategory() + " and " + dwelling2.getCategory() + " both have AC and the same number of bedrooms.\n");
		}
		else if (bedroomMax > dwelling2.getNumberOfBedrooms() && dwelling1.getNumberOfBedrooms() == dwelling3.getNumberOfBedrooms())
		{
			System.out.print(dwelling1.getCategory() + " and " + dwelling3.getCategory() + " both have AC and the same number of bedrooms.\n");
		}
		else if (bedroomMax > dwelling3.getNumberOfBedrooms() && dwelling1.getNumberOfBedrooms() == dwelling2.getNumberOfBedrooms())
		{
			System.out.print(dwelling2.getCategory() + " and " + dwelling3.getCategory() + " both have AC and the same number of bedrooms.\n");
		}
		else
		{
			if (dwelling1.getNumberOfBedrooms() == dwelling2.getNumberOfBedrooms() && dwelling1.getNumberOfBedrooms() == dwelling3.getNumberOfBedrooms())
			{
				System.out.print("All three Dwellings have AC and an equal number of bedrooms.\n");
			}
			else if (bedroomMax == dwelling1.getNumberOfBedrooms())
			{
				System.out.print("The Dwelling with AC and the most bathrooms is: " + dwelling1.getCategory() + "\n");
			}
			else if (bedroomMax == dwelling2.getNumberOfBedrooms())
			{
				System.out.print("The Dwelling with AC and the most bathrooms is: " + dwelling2.getCategory() + "\n");
			}
			else
			{
				System.out.print("The Dwelling with AC and the most bathrooms is: " + dwelling3.getCategory() + "\n");
			}
		}
	}
}