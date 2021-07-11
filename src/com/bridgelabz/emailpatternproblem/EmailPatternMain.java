package com.bridgelabz.emailpatternproblem;

import java.util.Scanner;

public class EmailPatternMain
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an email address: ");
		String email = scanner.nextLine();
		/**
		 * UC1
		 * validate first mandatory part in email
		 */
		scanner.close();
		EmailPattern obj = new EmailPattern();
		obj.checkFirstPart(email);
		/**
		 * UC2
		 * ensure @ in and validate the mandatory second part
		 */
		EmailPattern obj1 = new EmailPattern();
		obj1.checkSecondPart(email);
		/**
		 * UC3
		 * validate top level domain
		 */
		EmailPattern obj2 = new EmailPattern();
		obj2.checkThirdPart(email);
		
		/**
		 * UC4
		 * Validate optional part in email 
		 */
		EmailPattern obj3 = new EmailPattern();
		obj3.checkOptionalPart(email);

	}	
}
