package stringAndTextProcessing;

import java.util.Scanner;

public class Cryptography {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int key = scanner.nextInt();
		
		String cypherText = encrypted(input, key);
		
		System.out.println(cypherText);
		
		

	}
	
	public static String encrypted(String input, int key) {
		char[] message = input.toCharArray();
		
		for (int i = 0; i < input.length(); i++) {
			message[i] += key;
		}
		
		return new String(message);
	}

}
