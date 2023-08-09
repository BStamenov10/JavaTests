package methods;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		System.out.println(reverseNumber(number));

	}

	private static int reverseNumber(int number) {
		String line = Integer.toString(number);
		String reversed = "";
		char ch;
		
		for (int i = line.length() - 1; i >= 0; i--) {
			ch = line.charAt(i);
			reversed += ch;
		}
		
		return Integer.parseInt(reversed);
	}

}
