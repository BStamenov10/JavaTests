package arrays;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Number1: ");
		int number1 = scanner.nextInt();
		
		System.out.print("Number2: ");
		int number2 = scanner.nextInt();
		
		int count = 0;
		
		if (number1 > number2) {
			
			for (int i = number1 - 1; i >= number2 + 1; i--) {
				if (i % 5 == 0) {
					count++;
				}
			}
		}
		
		else if (number1 < number2){
			
			for (int i = number1 + 1; i <= number2 - 1; i++) {
				if (i % 5 == 0) {
					count++;
				}
			}
		}
		
		else {
			System.out.println("The number are equal so there aren't numbers between them");
			return;
		}
		
		
		System.out.println(count + " numbers are divisible by 5 without "
				+ "remain. between " + number1 + " and " + number2);
		
		
	}
}
