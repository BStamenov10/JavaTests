package exeptions;

import java.util.Scanner;

public class NumberInRange {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] line = scanner.nextLine().split(" ");

		int start = Integer.parseInt(line[0]);
		int end = Integer.parseInt(line[1]);

		System.out.println("Range: [" + start + "..." + end + "]");
		
		int num = readNumberInRange(scanner, start, end);
		System.out.println("Valid number: " + num);

	}

	public static int readNumberInRange(Scanner scanner, int start, int end) {

		while (true) {

			String inputLine = scanner.nextLine();

			try {
				int num = Integer.parseInt(inputLine);
				
				if (num >= start && num <= end) {
					return num;
				}
				
			} catch (Exception e) {
				
			}
			
			System.out.println("Invalid number: " + inputLine);

		}
		
	}
	
	
}
