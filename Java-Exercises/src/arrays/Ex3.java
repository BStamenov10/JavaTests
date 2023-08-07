package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// Да се напише програма, която сравнява два масива от тип
		// char лексикографски (буква по буква) и проверява
		// кой от двата е по-рано в лексикографската подредба.

		Scanner input = new Scanner(System.in);

		boolean isEqual = true;

		System.out.print("Enter the length of 1st arr: ");
		int n1 = input.nextInt();
		System.out.print("Enter the length of 2nd arr: ");
		int n2 = input.nextInt();

		char[] lexico1 = new char[n1];
		char[] lexico2 = new char[n2];

		for (int i = 0; i < lexico1.length; i++) {
			System.out.printf("character[%d] = ", i);
			lexico1[i] = input.next().charAt(0);
		}
		System.out.println("\n2nd array:");
		for (int i = 0; i < lexico2.length; i++) {
			System.out.printf("character[%d] = ", i);
			lexico2[i] = input.next().charAt(0);
		}

		if (lexico1.length < lexico2.length) {
			System.out.println("1st array is lexicographicaly first " + Arrays.toString(lexico1));
		} else if (lexico2.length < lexico1.length) {
			System.out.println("2nd array us lexicographicaly first " + Arrays.toString(lexico2));
		} else {

			for (int i = 0; i < lexico2.length; i++) {
				if (lexico1[i] < lexico2[i]) {
					System.out.println("First array is lexicographicaly first.");
					isEqual = false;
					break;
				} else if (lexico2[i] < lexico1[i]) {
					System.out.println("Second array is lexicographicaly first.");
					isEqual = false;
					break;
				}
			}
			
			if (isEqual) {
				System.out.println("Arrays are lexicographicaly equal.");
			}

		}

	}

}
