package streams.files.directories;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class FixingSubtitles {
	private static final int COEFFICIENT = 2;
	private static final int ADDITION = 5000;
	private static final String INPUT_FILE = "GORA.sub";
	private static final String OUTPUT_FILE = "fixed.sub";

	public static void main(String[] args) {

		Scanner fileInput = null;
		PrintStream fileOutput = null;

		try {
			File file = new File(INPUT_FILE);
			fileInput = new Scanner(file, "windows-1251");
			fileOutput = new PrintStream(OUTPUT_FILE, "windows-1251");

			String line;

			while (fileInput.hasNextLine()) {
				line = fileInput.nextLine();
				String fixedLine = fixeLine(line);
				fileOutput.println(fixedLine);
			}

		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (UnsupportedEncodingException e) {
			System.err.println(e.getMessage());
		} finally {
			if (fileInput != null) {
				fileInput.close();
			}
			if (fileOutput != null) {
				fileOutput.close();
			}

		}

	}

	public static String fixeLine(String line) {

		int indexStartTime = line.indexOf("}");
		String startTime = line.substring(1, indexStartTime);

		int newStartTime = Integer.parseInt(startTime) * COEFFICIENT + ADDITION;

		int indexEndTime = line.indexOf("}", indexStartTime + 1);
		String endTime = line.substring(indexStartTime + 2, indexEndTime);

		int newEndTime = Integer.parseInt(endTime) * COEFFICIENT + ADDITION;

		String fixedLine = "{" + newStartTime + "}" + "{" + newEndTime + "}" + line.substring(indexEndTime + 1);

		return fixedLine;
	}

}
