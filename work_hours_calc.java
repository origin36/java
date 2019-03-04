/*********************************************************
*WightDanielUnit4
*Daniel Wight
*
*Program that determines hours of work based on criteria
*********************************************************/

import java.util.Scanner;

public class WightDanielUnit4
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);

		char ans;        //answer to whether or not you want to continue
		int day;         //numeric date of the week
		boolean sick;    //user input whether or not they are sick

		do
		{
			System.out.println("Enter the day of the week (1=Mon, 2=Tue, 3=Wed, etc.):");
			day = stdIn.nextInt();  //user entered numeric date of the week

			if (day < 1 || day > 7)  //execute this block if user enters an invalid date (day less than 1 or greater than 7)
			{
				System.out.println("Invalid date entered.");
			}  //end if

			else  //execute this block if user enters valid date
			{
				System.out.println("Are you sick? (True or False):");
				sick = stdIn.nextBoolean();  //user tells program whether or not they are sick

				if ((sick) || day == 6 || day == 7)  //excute this block if user is sick, day is Saturday or Sunday
				{
				System.out.println("Stay in bed!");
				}  //end if

				else  //execute this block if user is NOT sick and day is Monday through Friday
				{
					switch(day)  //switches numeric date of the weekday with an output
					{
						case 1: case 3:  //work hours for Monday and Wednesday
							System.out.println("Work Hours for today are 8-5");
								break;
						case 2:          //work hours for Tuesday
							System.out.println("Work Hours for today are 7-4");
								break;
						case 5:          //work hours for Friday
							System.out.println("Work Hours for today are 8-12");
								break;
						default:         //work hours for Thursday
							System.out.println("Take the day off");
								break;
					}  //end switch
				}  //end else
			}  //end else

			System.out.println("Would you like to run again? (y/n)");
			ans = stdIn.next().charAt(0);  //answer y or n

		}while (ans == 'y');  //end while
	}  //end main
}  //end public class WightDanielUnit4