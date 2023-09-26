package stringAndTextProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindExtension {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<String> paths = new ArrayList<String>();

		String path = scanner.nextLine();

		paths.add(path);

		while (true) {
			path = scanner.nextLine();

			if (path.equals("")) {
				break;
			}

			paths.add(path);
		}

		for (String item : paths) {
			String filename = findExtension(item);
			System.out.println(filename);
		}

	}

	private static String findExtension(String path) {
		int index = path.lastIndexOf(".");

		String filename = path.substring(index + 1);
		return filename;
	}

}
