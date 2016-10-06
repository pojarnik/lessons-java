package ru.lesson;

import java.util.Scanner;

public class InteractRunner
{
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		try 
		{
			Calculator calc = new Calculator();
			String exit = "no";
			while (!exit.equals("yes")) 
			{
				System.out.println("Enter first arg: ");
				String first = reader.next();
				System.out.println("Enter second arg: ");
				String second = reader.next();
				calc.add(Integer.valueOf(first), Integer.valueOf(second));
				/*
				try {
					calc.div(Integer.valueOf(args[0]), Integer.valueOf(args[1]));
				} catch (UserException e) {
					//e.printStackTrace();
					System.out.println(e.getMessage());
					System.out.println("Please enter two args.");
				}
				*/
				System.out.println("Result : " + calc.getResult());
				calc.cleanResult();
				System.out.println("Exit : yes/no");
				exit = reader.next();
			}
		} 
		finally 
		{
			reader.close();
		}
	}
}