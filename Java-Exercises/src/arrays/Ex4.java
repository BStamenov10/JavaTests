package arrays;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter lenght for the array: ");
		int n = input.nextInt();

		int counterSameElements = 1;
		int num = 0;
		int count = 1;

		int[] numbers = new int[n];

		for (int i = 0; i < numbers.length; i++) {
			System.out.printf("Enter value[%d]: ", i);
			numbers[i] = input.nextInt();
		}

		for (int i = 0; i < numbers.length -1; i++) {
			if (numbers[i] == numbers[i + 1]) {
				counterSameElements++;
			} else {
				counterSameElements = 1;
			}
			
			if (counterSameElements > count) {
				count = counterSameElements;
				num = numbers[i];
			}
		}
		
		for (int i = 0; i < count; i++) {
			System.out.print(num);
		}

	}

}
