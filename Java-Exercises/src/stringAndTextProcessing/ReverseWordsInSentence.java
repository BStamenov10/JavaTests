package stringAndTextProcessing;

import java.util.Scanner;

public class ReverseWordsInSentence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("------Enter some text-----");
		String line = input.nextLine();
		
		String[] arr = line.split("[\s]+");
		
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

	}

}
