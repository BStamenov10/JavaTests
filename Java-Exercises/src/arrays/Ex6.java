package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.print("Enter array length: ");
		int n = input.nextInt();
		System.out.print("Enter K (K < N): ");
		int k = input.nextInt();
		
		Integer[] array = new Integer[n];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		
		 Arrays.sort(array, (a, b) -> b.compareTo(a));
		 
		System.out.println(Arrays.toString(array));
	
		
		for (int i = 0; i < k; i++) {
			sum += array[i];
		}
		System.out.println("Biggest sum is: " + sum);
		

	}

}
