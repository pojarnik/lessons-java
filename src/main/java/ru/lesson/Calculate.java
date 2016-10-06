package ru.lesson;

/**
	first program)
*/

public class Calculate {
    public static void main(String[] args) {
		System.out.println("Calculate..");
		int a = Integer.valueOf(args[0]);
		int b = Integer.valueOf(args[1]);
		int sum = a + b;
		System.out.println("Sum = " + sum);
		System.out.println("args[0].toString() = " + args[0].toString());
    }
}
