package streams.files.directories;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FileNames {

	public static void main(String[] args) {

		Scanner fileReader = null;
		PrintStream fileOutput = null;
		try {
			File file = new File("names.txt");
			fileReader = new Scanner(file);
			fileOutput = new PrintStream("sorted_names.txt");
			
			List<String> names = new ArrayList<String>();
			
			while (fileReader.hasNextLine()) {
				String line = fileReader.nextLine();
				names.add(line);
			}
			Collections.sort(names);
			
			for (String name : names) {
				fileOutput.println(name);
			}
			
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} finally {
			if (fileReader != null) {
				fileReader.close();
			}

			if (fileOutput != null) {
				fileOutput.close();
			}
		}

	}

}
