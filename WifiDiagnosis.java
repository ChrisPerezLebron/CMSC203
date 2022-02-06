/*
 * Class: CMSC203 CRN 34165
 * Instructor: Dr. Grinberg
 * Description: (Give a brief description for each Class)
	WifiDiagnosis class: contains one method called main
		main method: uses a series of nested if statements to help the user trouble 
					shoot their internet connection
 * Due: 02/07/2022
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Christopher Perez Lebron
*/

import java.util.Scanner;

public class WifiDiagnosis 
{
	//main and only method. Helps user trouble shoot wifi. 
	public static void main(String[] args)
	{
		String userResponse; 
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("if you currently have internet "
					+ "problems this might work\n");
		
		System.out.println("First step: reboot your computer.");
		System.out.print("did that fix your internet? (yes or no)");
		userResponse = keyboard.nextLine(); 
		//remove spaces
		userResponse = userResponse.replaceAll("\\s", "");
		//validate input
		while (!(userResponse.equalsIgnoreCase("yes")) && !(userResponse.equalsIgnoreCase("no")))
		{
			System.out.println("ERROR: Please enter yes or no:");
			userResponse = keyboard.nextLine();
			userResponse = userResponse.replaceAll("\\s", "");
		}
		if (userResponse.equalsIgnoreCase("yes"))
			System.out.println("\nrebooting your computer "
						+ "seemed to work.");
		else
		{
			System.out.println("\nSecond step: reboot your router.");
			System.out.print("did that fix your internet? (yes or no)");
			userResponse = keyboard.nextLine();
			//remove spaces
			userResponse = userResponse.replaceAll("\\s", "");
			//validate input
			while (!(userResponse.equalsIgnoreCase("yes")) && !(userResponse.equalsIgnoreCase("no")))
			{
				System.out.println("ERROR: Please enter yes or no:");
				userResponse = keyboard.nextLine();
				userResponse = userResponse.replaceAll("\\s", "");
			}
			if (userResponse.equalsIgnoreCase("yes"))
				System.out.println("\nRebooting your router seemed to work.");
			else 
			{
				System.out.println("\nThird step: make sure the cabled are firmly connected " 
							+ "and your router has power");
				System.out.print("did that fix your internet? (yes or no)");
				userResponse = keyboard.nextLine();
				//remove spaces
				userResponse = userResponse.replaceAll("\\s", "");
				//validate input
				while (!(userResponse.equalsIgnoreCase("yes")) && !(userResponse.equalsIgnoreCase("no")))
				{
					System.out.println("ERROR: Please enter yes or no:");
					userResponse = keyboard.nextLine();
					userResponse = userResponse.replaceAll("\\s", "");
				}
				if (userResponse.equalsIgnoreCase("yes"))
					System.out.println("\nadjusting your cables seemed to work.");
				else
				{
					System.out.println("\nFourth step: move your computer closer to the " 
								+ "router and try to connect");
					System.out.print("did that fix your internet? (yes or no)");
					userResponse = keyboard.nextLine();
					//remove spaces
					userResponse = userResponse.replaceAll("\\s", "");
					//validate input
					while (!(userResponse.equalsIgnoreCase("yes")) && !(userResponse.equalsIgnoreCase("no")))
					{
						System.out.println("ERROR: Please enter yes or no:");
						userResponse = keyboard.nextLine();
						userResponse = userResponse.replaceAll("\\s", "");
					}
					if (userResponse.equalsIgnoreCase("yes"))
						System.out.println("\nmoving your computer closer to the router " 
									+ "seemed to work");
					else
					{
						System.out.println("\nFifth step: contact your ISP");
						System.out.println("make sure your ISP is hooked up with your router");
					}
				}
			}
		}
		keyboard.close();
		System.out.println("\n\n\n\nPROGRAMMER: Christopher Perez Lebron");
						
	}
}
