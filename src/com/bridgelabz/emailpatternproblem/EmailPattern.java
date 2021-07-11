package com.bridgelabz.emailpatternproblem;

import java.util.regex.Pattern;

public class EmailPattern
{
	/**
	 * Method to validate first mandatory part in email
	 * @param email
	 */
	public void checkFirstPart(String email) 
	{
		boolean isMatched = Pattern.compile("(^[a-zA-Z0-9]+)").matcher(email).matches();
		if(isMatched)
		{
			System.out.println("It is valid");
		}
		else
		{
			System.out.println("invalid");
		}
	}
	/**
	 * Method to ensure @ in and validate the mandatory secnod part
	 * @param email
	 */
	public void checkSecondPart(String email) 
	{
		boolean isMatched = Pattern.compile("@[a-zA-Z0-9]+").matcher(email).matches();
		if(isMatched)
		{
			System.out.println("It is valid");
		}
		else
		{
			System.out.println("invalid");
		}
	}
	
}
