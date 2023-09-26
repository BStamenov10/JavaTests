package streams.files.directories;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReplaceWord {

	public static void main(String[] args) {

		String inputFile = "wordStart.txt";
		String outputFile = "replaced.txt";

		try {

			BufferedReader reader = new BufferedReader(new FileReader(inputFile));
			BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
			String line;

			while ((line = reader.readLine()) != null) {
				String[] words = line.split("\\s+");
				for (String word : words) {
					if ("start".equals(word)) {
						word = "finish";
					}
					writer.write(word + " ");
				}

				writer.newLine();
			}
			reader.close();
			writer.close();

			System.out.println(
					"Замяната на цели думи 'start' с 'finish' е завършена и резултатът е записан в " + outputFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
