package objectsAndClasses;

import java.util.Scanner;

public class HypotenuseOfTriangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter side a: ");
		double a = scanner.nextInt();
		
		System.out.print("Eneter side b: ");
		double b = scanner.nextInt();
		
		double c = (a *a)  + (b * b);
		
		double result = Math.sqrt(c);
		
		System.out.println(result);
		
		
	}

}
