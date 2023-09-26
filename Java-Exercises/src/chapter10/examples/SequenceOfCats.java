package chapter10.examples;

import java.util.Scanner;

import chapter10.Cat;
import chapter10.Sequence;

public class SequenceOfCats {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] n = new int[10];
		
		
		for (int i = 0; i < n.length; i++) {
			System.out.print("Name of the cat: ");
			String name = input.nextLine();
			
			Cat cat = new Cat(name + Sequence.nextValue());
			cat.sayMiau();
			System.out.println();
		}
		
		

	}

}
