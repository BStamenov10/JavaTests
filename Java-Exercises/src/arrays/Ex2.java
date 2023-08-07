package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		//Да се напише програма, която чете два масива от конзолата и проверява дали са еднакви.

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of array1: ");
		int n1 = input.nextInt();
		System.out.print("Enter the length of array2: ");
		int n2 = input.nextInt();
		System.out.println();

		int[] array1 = new int[n1];
		int[] array2 = new int[n2];

		for (int i = 0; i < array1.length; i++) {
			System.out.printf("array1[%d]: ", i);
			array1[i] = input.nextInt();
		}

		System.out.println();

		for (int i = 0; i < array2.length; i++) {
			System.out.printf("array2[%d]: ", i);
			array2[i] = input.nextInt();
		}
		
		boolean isEqual = false;

		for (int i = 0; i < array1.length; i++) {
			if (array1[i] == array2[i]) {
				if (array1.length == array2.length) {
					isEqual = true;
				} else {
					isEqual = false;
				}
			}else {
				isEqual = false;
			}
		}
		
		//System.out.println("\n"+isEqual);
		System.out.println("\n"+isEqual+ "\nthe array1 - "+Arrays.toString(array1)+"\nthe array2 - "+ Arrays.toString(array2));
		

	}

}
