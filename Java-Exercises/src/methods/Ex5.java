package methods;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length for the array: ");
		
		int length = input.nextInt();
		
		int[] numbers = new int[length];
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Enter a number: ");
			numbers[i] = input.nextInt();
		}
		
			System.out.print("Enter in what postition to compare numbers: ");
			int postition = input.nextInt();
			
			System.out.println(Arrays.toString(numbers));
			compare(postition, numbers);	
	}
	
	public static void compare(int position, int[] numbers) {
		
		if (position == 0) {
			if (numbers[position] < numbers[position + 1]) {
				System.out.printf("The number in postition %d (%d) is smaller than it's right", position, numbers[position]);
			} else if (numbers[position] == numbers[position + 1]) {
				System.out.printf("The number %d (%d) is equal to his right neighbour" , position, numbers[position]);
			} else {
				System.out.printf("The number in postition %d (%d) is bigger than it's right", position, numbers[position]);
			}
		}
		
		else if (position == numbers.length - 1) {
			if (numbers[numbers.length - 1] < numbers[numbers.length - 2]) {
				System.out.printf("The number in postition %d (%d) is smaller than it's left", position, numbers[position]);
			} else if (numbers[numbers.length - 1] == numbers[numbers.length - 2]) {
				System.out.printf("The number %d (%d) is equal to his left neighbour" , position, numbers[position]);
			} else {
				System.out.printf("The number in postition %d (%d) is bigger than it's left", position, numbers[position]);
			}
		}
		
		else {
			if (numbers[position] < numbers[position - 1]) {
				
				if (numbers[position] < numbers[position + 1]) {
					System.out.printf("The number in postition %d (%d) is smaller than it's neighbours ", position, numbers[position]);
				} else if (numbers[position] == numbers[position +1]) {
					System.out.printf("The number in postition %d (%d) is smaller than it's left and equal to it's right ", position, numbers[position]);
				} else {
					System.out.printf("The number in postition %d (%d) is smaller than it's left and bigger than it's right ", position, numbers[position]);
				}
			} else if (numbers[position] == numbers[position - 1]) {
				if (numbers[position] < numbers[position + 1]) {
					System.out.printf("The number in postition %d (%d) is equal than it's left and smaller than it's right ", position, numbers[position]);
				} else if (numbers[position] == numbers[position + 1]) {
					System.out.printf("The number in postition %d (%d) is equal to it's neighbours ", position, numbers[position]);
				} else {
					System.out.printf("The number in postition %d (%d) is equal than it's left and bigger than it's right ", position, numbers[position]);
				}
			}
			else {
				if (numbers[position] < numbers[position + 1]) {
					System.out.printf("The number in postition %d (%d) is bigger than it's left and smaller than it's right ", position, numbers[position]);
				} else if (numbers[position] == numbers[position + 1]) {
					System.out.printf("The number in postition %d (%d) is bigger than it's left and equal to it's right ", position, numbers[position]);
				} else {
					System.out.printf("The number in postition %d (%d) is bigger than it's neighbours ", position, numbers[position]);
				}
			}
		}
	
		
		
	}

}
