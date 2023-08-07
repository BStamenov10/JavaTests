package arrays;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a checking number: ");
		int checkNumber = input.nextInt();
		

		int tempSum;
		int sum = 0;

		System.out.print("Enter array length: ");
		int n = input.nextInt();

		int[] array = new int[n];

		for (int i = 0; i < array.length; i++) {
			System.out.printf("Enter {%d} element: ", i);
			array[i] = input.nextInt();
		}

		for (int i = 0; i < array.length - 1; i++) {
			tempSum = array[i];

			for (int j = i + 1; j < array.length; j++) {
				tempSum += array[j];
				if (tempSum == checkNumber) {
					sum = tempSum;
				}
			}
		}
		
		System.out.println("Sum is: " + sum);

	}

}
