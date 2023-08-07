package methods;

import java.util.Scanner;

public class Months {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		System.out.print("Eneter the first month (1-12): ");
		int firstMonth = input.nextInt();
		
		System.out.print("Eneter the second month (1-12): ");
		int secondMonth = input.nextInt();
		
		sayPeriod(firstMonth, secondMonth);
		
	}

	public static void sayMonth(int month) {

		String monthName;

		switch (month) {
		case 1:
			monthName = "January";
			break;
		case 2:
			monthName = "February";
			break;
		case 3:
			monthName = "March";
			break;
		case 4:
			monthName = "April";
			break;
		case 5:
			monthName = "May";
			break;
		case 6:
			monthName = "June";
			break;
		case 7:
			monthName = "July";
			break;
		case 8:
			monthName = "August";
			break;
		case 9 :
			monthName = "September";
			break;
		case 10: 
			monthName = "Octomber";
			break;
		case 11:
			monthName = "November";
			break;
		case 12:
			monthName = "December";
			break;
			
		default:
			monthName = "Invalid value for months (1-12)";
			break;
		}
		
		System.out.print(monthName);

	}
	
	public static void sayPeriod(int startMonth, int endMonth) {
		
		if (startMonth > 12 || startMonth < 1) {
			System.out.printf("Error! - Invalid value for month (%d): Required (1-12)" , startMonth);
			return;
		} else if (endMonth > 12 || endMonth < 1) {
			System.out.printf("Error! - Invalid value for month (%d): Required (1-12)" , endMonth);
			return;
		}
		
		int period = endMonth - startMonth;
		
		if (period < 0) {
			period += 12;
		}
		
		System.out.printf(
				"There is %d months period from ", period);
		
				sayMonth(startMonth);
				System.out.print(" to ");
				sayMonth(endMonth);
				System.out.print(".");
		
	}

}
