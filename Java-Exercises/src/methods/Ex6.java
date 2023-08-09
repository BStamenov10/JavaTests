package methods;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter array length: ");
		int n = input.nextInt();
		
		int[] numbers = new int[n];
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Enter number: ");
			numbers[i] = input.nextInt();
		}
		System.out.print("Enter a position to compare: ");
		int pos = input.nextInt();
		
		System.err.println(isEqual(pos, numbers));
		

	}

	public static int isEqual(int pos, int[] numbers) {

		if (pos == 0) {
			return -1;
		} else if (pos == numbers.length - 1) {
			return -1;
		}

		if (numbers[pos] > numbers[pos - 1] && numbers[pos] > numbers[pos + 1]) {
			return pos;
		} else {
			return -1;

		}
	}
}
