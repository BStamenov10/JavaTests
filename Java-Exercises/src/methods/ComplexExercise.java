package methods;

import java.util.Scanner;

public class ComplexExercise {

	public static void main(String[] args) {

		System.out.println("-------Hello, choose what problem to solve-------------");
		System.out.println("-------PRESS 1 - To reverse a number-------------------");
		System.out.println("-------PRESS 2 - to find the average sum of numbers----");
		System.out.println("-------PRESS 3 - to calculate a linear equation--------");
		System.out.println("-------PRESS 4 - to stop the program------------------- ");
		
		
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.println();
			System.out.print("Enter a number from 1-4 = ");
			int choice = input.nextInt();
			System.out.println();
			
			if (choice == 1) {
				System.out.println("------reversing a number------");
				reverseNumber();
			} else if (choice == 2) {
				System.out.println("------printing an average------");
				printAverage();
			} else if (choice == 3) {
				System.out.println("------calculating an equation------");
				calcEquation();
			} else if (choice == 4) {
				System.out.println("-------See you soon--------");
				break;
			}
		}
	}

	public static void reverseNumber() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to reverse:");
		int number = input.nextInt();

		if (number < 0) {
			System.out.println("Enter a positive number!!!!");
			return;
		}

		String line = Integer.toString(number);
		String reverse = "";
		char ch;

		for (int i = line.length() - 1; i >= 0; i--) {
			ch = line.charAt(i);
			reverse += ch;
		}

		System.out.println(Integer.parseInt(reverse));

	}

	public static void printAverage() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter lenght for the array of numbers: ");
		int n = input.nextInt();
		double[] numbers = new double[n];
		for (int i = 0; i < numbers.length; i++) {
			System.out.printf("number[%d] = ", i + 1);
			numbers[i] = input.nextDouble();
		}

		double sum = 0;
		double average;
		int averageInt = 0;

		if (numbers.length <= 0) {
			System.out.println("You have to enter a numbers!!!");
			return;
		} else {

			for (double item : numbers) {
				sum += item;
			}

			average = sum / numbers.length;
			if (average % 1 == 0) {
				averageInt = (int) average;
				System.out.printf("The average sum of the array is: %d%n", averageInt);
			} else {
				System.out.printf("The average sum of the array is: %.2f%n", average);
			}
		}

	}

	public static void calcEquation() {
		Scanner input = new Scanner(System.in);
		System.out.println("Calculate linear equation: a * x + b = 0");
		System.out.print("Enter value for 'a' - ");
		double a = input.nextDouble();
		System.out.print("Enter value for 'x' - ");
		double x = input.nextDouble();
		System.out.print("Enter value for 'b' - ");
		double b = input.nextDouble();

		double result = 0;
		int resultInt = 0;

		if (a != 0) {
			result = a * x + b;

			if (result % 1 == 0) {
				resultInt = (int) result;
				System.out.println(resultInt);
			} else {
				System.out.println(result);
			}

		} else {
			System.out.println("number 'a' can't be equal to 0!!!");
		}

	}

}
