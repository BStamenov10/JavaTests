package streams.files.directories;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrintingOddLines {

	public static void main(String[] args) {
		Scanner fileReader = null;
		try {
			File file = new File("numbers.txt");
			fileReader = new Scanner(file);

			int lineNumber = 1;
			while (fileReader.hasNextLine()) {
				String line = fileReader.nextLine();
				if (lineNumber % 2 != 0) {
					System.out.println(line);
				}

				lineNumber++;
			}
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} finally {
			if (fileReader != null) {
				fileReader.close();
			}
		}

	}

}
