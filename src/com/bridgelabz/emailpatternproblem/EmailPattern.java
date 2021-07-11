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
	 * Method to ensure @ in and validate the mandatory second part
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
	/**
	 * Method to check top level domain is valid or not
	 * @param email
	 */
	public void checkThirdPart(String email) 
	{
		boolean isMatched = Pattern.compile("([.][a-zA-Z]{2,4})").matcher(email).matches();
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
	 * Method to check optional part in email is valid or not
	 * @param email
	 */
	public void checkOptionalPart(String email) 
	{
		boolean isMatched = Pattern.compile("([._+-][a-zA-Z0-9]+)*").matcher(email).matches();
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
	 * Method to check country code is valid or not
	 * @param email
	 */

	public void checkCountryCode(String email) 
	{
		boolean isMatched = Pattern.compile("([.][a-zA-Z]{2})*").matcher(email).matches();
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
	 * Method to check given email is valid or not
	 */
	public void isValid(String email) 
	{
		boolean isMatched = Pattern.compile("^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+([.][a-zA-Z]{2,4})([.][a-zA-Z]{2})*$").matcher(email).matches();
		if(isMatched)
		{
			System.out.println("It is valid email");
		}
		else
		{
			System.out.println("invalid email");
		}
	}
}
