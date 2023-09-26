package exeptions;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
					int num = Integer.parseInt(line);
		try {

			double result = calcSqrt(num);
			System.out.printf("%.2f\n",result);
		} catch (Exception e) {
			System.out.println("Invalid");
		}finally {
			System.out.println("Goodbay");
		}
		
	}
	
	public static double calcSqrt(double num) {
		if (num < 0) {
			throw new IllegalArgumentException("Sqrt for negative numbers is undefined!");
		}
		
		return Math.sqrt(num);
	}

}
