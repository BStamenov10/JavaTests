package stringAndTextProcessing;

public class ForbiddenWords {

	public static void main(String[] args) {

		String text = "Microsoft announced its next generation Java compiler today. "
				+ "\nIt uses advanced parser and special optimizer for the Microsoft JVM.";
		System.out.println(text);
		String bannedWords = "Java,JVM,Microsoft";
		String[] bannedWordsArray = bannedWords.split(",");

		for (String forbiddenWord : bannedWordsArray) {
			text = text.replaceAll(forbiddenWord, repeat("*", forbiddenWord.length()));
		}
		System.out.println();
		System.out.println(text);

	}

	public static String repeat(String word, int count) {
		String[] copies = new String[count];

		for (int i = 0; i < copies.length; i++) {
			copies[i] = word;
		}

		return String.join("", copies);
	}

}
