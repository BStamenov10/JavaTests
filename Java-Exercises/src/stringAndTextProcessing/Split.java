package stringAndTextProcessing;

import java.util.Scanner;

public class Split {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String text = scanner.nextLine();
		
		System.out.println(reverseText(text));
		
		StringBuilder result = new StringBuilder();
		String txt = "AbCdEfGhLmNoPqRsTwXyZ";
		
		System.out.println(extractCapitals(txt));
		
		
	}
	private static String extractCapitals(String txt) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < txt.length(); i++) {
			char ch = txt.charAt(i);
			if (Character.isUpperCase(ch)) {
				result.append(ch);
			}
		}
		return result.toString();
	}
	
	public static String reverseText(String text) {
		StringBuilder sb = new StringBuilder();
		
		for (int i = text.length() - 1; i >= 0; i--) {
			sb.append(text.charAt(i));
		}
		return sb.toString();
	}

}
