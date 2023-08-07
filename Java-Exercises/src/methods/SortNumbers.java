package methods;

import java.util.Arrays;
import java.util.Scanner;

public class SortNumbers {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Eneter length for the array: ");
		int n = scanner.nextInt();
		
		
		
		
		System.out.println(Arrays.toString(sortingNumbers(5,7,2,10,18)));
		
		
		
		scanner.close();

	}
	
	public static int[] sortingNumbers(int...numbers) {
		
		Arrays.sort(numbers);
		
		return numbers;
		
	}

}
