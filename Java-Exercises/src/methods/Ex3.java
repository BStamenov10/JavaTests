package methods;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		takeLastDigit(number);
		
	}
	
	public static void sayNumber(int number) {
		
		String letter;
		
		switch (number) {
		case 1:
			letter = "one";
			break;
		case 2:
			letter = "two";
			break;
		case 3:
			letter = "three";
			break;
		case 4:
			letter = "four";
			break;
		case 5: 
			letter = "five";
			break;
		case 6:
			letter = "six";
			break;
		case 7:
			letter = "seven";
			break;
		case 8:
			letter = "eight";
			break;
		case 9: 
			letter = "nine";
			break;
			
		default:
			letter = "zero";
			break;
		}
		System.out.print(letter);
		
	}
	
	public static void takeLastDigit (int number) {
		
		int result = number % 10;
		
		System.out.printf("%d - \"",number);
		sayNumber(result);
		System.out.print("\"");

	}

}
