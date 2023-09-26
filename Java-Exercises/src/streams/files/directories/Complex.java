package streams.files.directories;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Complex {

	public static void main(String[] args) {

		String wordsFile = "words.txt";
		String textFile = "text.txt";
		String outputFile = "result.txt";

		Scanner wordsScanner = null;
		Scanner textScanner = null;
		PrintStream output = null;

		try {
			wordsScanner = new Scanner(new File(wordsFile));
			Set<String> wordsList = new HashSet<String>();
			while (wordsScanner.hasNext()) {
				wordsList.add(wordsScanner.next());
			}

			textScanner = new Scanner(new File(textFile));
			Map<String, Integer> wordCounts = new HashMap<String, Integer>();

			while (textScanner.hasNext()) {
				String word = textScanner.next();
				if (wordsList.contains(word)) {
					wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
				}
			}

			List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordCounts.entrySet());
			sortedWords.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
			output = new PrintStream(new File(outputFile));
			for (Map.Entry<String, Integer> entry : sortedWords) {
				output.println(entry.getKey() + ": " + entry.getValue());
			}

			System.out.println("Резултатът е записан в \"" + outputFile + "\"");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			wordsScanner.close();
			textScanner.close();
			output.close();
		}
	}
}
