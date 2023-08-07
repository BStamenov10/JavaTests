package methods;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Number 1: ");
		int numberOne = input.nextInt();
		
		System.out.print("Number 2: ");
		int numberTwo = input.nextInt();
		
		System.out.println(multiply(numberOne, numberTwo));

	}
	
	public static float multiply(int num1, int num2) {
		
		int result = num1 * num2;
		
		return result;
		
	}

}
