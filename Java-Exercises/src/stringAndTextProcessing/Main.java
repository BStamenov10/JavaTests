package stringAndTextProcessing;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] words = scanner.nextLine().split(" ");
		
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			words[i] = repeat(word, word.length());
		}
		System.out.println(String.join("", words));
		

	}
	public static String repeat(String word, int count) {
		String[] copies = new String[count];
		
		for (int i = 0; i < copies.length; i++) {
			copies[i] = word;
		}
		
		return String.join("", copies);
	}

}
