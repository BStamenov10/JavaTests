package stringAndTextProcessing;

import java.util.Scanner;

public class ReverseText {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("-----Enter some text-----");
		String text = input.nextLine();

		System.out.println("-----The reversed text is-----");
		System.out.println(reverseText(text));


	}

	public static String reverseText(String text) {
		StringBuilder sb = new StringBuilder();
		for (int i = text.length() - 1; i >= 0; i--) {

			sb.append(text.charAt(i));
		}

		return sb.toString();
	}

}
