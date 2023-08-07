package methods;

import java.util.Scanner;

public class FahrenheitToCelsius {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your temperature in ºF: ");
		double temperature = input.nextDouble();
		
		temperature = toCelsius(temperature);
		
		System.out.printf("Your body temperature in Celsius degrees is %.1f.%n",temperature);
		
		if (temperature >= 37) {
			System.out.println("You are ill!");
		}
		
		input.close();
		
	}
	
	public static double toCelsius(double fahrenheit) {
		
		double celsius = (fahrenheit - 32) * 5 / 9;
		
		return celsius;
	}

}
