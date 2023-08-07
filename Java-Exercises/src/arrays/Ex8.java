package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tempCount = 1;
		int count = 1;
		int foundNumber = 0;

		System.out.print("Enter array length: ");
		int n = input.nextInt();
		
		int[] array = new int[n];
		
		for (int i = 0; i < array.length; i++) {
			System.out.printf("Enter {%d} element: ", i);
			array[i] = input.nextInt();
		}
		
		Arrays.sort(array);
		
		for (int i = 0; i < array.length-1; i++) {
			if (array[i] == array[i+1]) {
				tempCount++;
			}else {
				tempCount = 1;
			}
			
			if (tempCount>count) {
				count = tempCount;
				foundNumber = array[i];
			}
		}
		System.out.println(Arrays.toString(array));
		System.out.println("Number: "+foundNumber+", found "+count+" times!");
		

	}

}
