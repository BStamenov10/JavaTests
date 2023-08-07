package methods;

import java.util.Scanner;

public class Clock {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("What time is it?");
		
		System.out.print("Hours: ");
		int hours = input.nextInt();
		System.out.print("Minutes: ");
		int minutes = input.nextInt();
		
		boolean isValidTime = validateHours(hours) && validateMinutes(minutes);
		
		if (isValidTime) {
			
			if (hours < 12) {
				System.out.printf("The time is %d:%d am now.%n", hours, minutes);	
			} else {
				System.out.printf("The time is %d:%d pm now.%n", hours, minutes);
			}
			
		} else {
			System.out.println("Incorect time!");
		}
		
		
		input.close();
		
	}
	
	public static boolean validateHours(int hours) {
		
		boolean result = (hours > 0) && (hours <= 23);
		
		return result;
	}
	
	public static boolean validateMinutes(int minutes) {
		
		boolean result = (minutes > 0) && (minutes <= 59);
		
		return result;
	
	}

}
