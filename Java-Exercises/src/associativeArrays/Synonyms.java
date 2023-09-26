package associativeArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Synonyms {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());

		Map<String, List<String>> wordSynonyms = new TreeMap<String, List<String>>();

		for (int i = 0; i < num; i++) {
			String word = scanner.nextLine();
			String synonym = scanner.nextLine();

			List<String> currentSynonym = wordSynonyms.get(word);
			if (currentSynonym != null) {
				currentSynonym.add(synonym);

			} else {
				currentSynonym = new ArrayList<String>();
				wordSynonyms.put(word, currentSynonym);
				currentSynonym.add(synonym);
			}
		}

		for (Map.Entry<String, List<String>> entry : wordSynonyms.entrySet()) {
			System.out.printf("%s - %s%n", entry.getKey(), String.join(", ", entry.getValue()));
		}

		System.out.print("\nEnter a word to see it's synonyms: ");
		String checkWord = scanner.nextLine();
		if (wordSynonyms.containsKey(checkWord)) {
			System.out.printf("%s - %s", checkWord, String.join(", ", wordSynonyms.get(checkWord)));
		}

	}

}
