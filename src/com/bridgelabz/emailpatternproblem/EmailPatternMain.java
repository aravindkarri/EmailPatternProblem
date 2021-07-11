package com.bridgelabz.emailpatternproblem;

import java.util.Scanner;

public class EmailPatternMain
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an email address: ");
		String email = scanner.nextLine();
		scanner.close();
		
		/**UC1
		 * Check first mandatory part in email is valid or not
		 */
		EmailPattern obj = new EmailPattern();
		obj.checkFirstPart(email);
	}	
}
