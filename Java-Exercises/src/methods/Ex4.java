package methods;

import java.util.Arrays;

public class Ex4 {

	public static void main(String[] args) {
		
		
		System.out.println(countNumber(5,8,4,5,7,5,8));

	}
	
	public static int countNumber(int... numbers ) {
		
		int count = 0;
		Arrays.sort(numbers);
		
		for (int i = 0; i < numbers.length - 1; i++) {
			if (numbers[i] == numbers[i + 1]) {
				count ++;
			}
		}
		
		System.out.println(Arrays.toString(numbers));
		
		return count;
	}

}
