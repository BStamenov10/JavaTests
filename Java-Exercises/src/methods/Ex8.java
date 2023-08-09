package methods;

import java.math.BigInteger;

public class Ex8 {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			System.out.printf("%d! = %d%n", i, factorial(i));
		}

	}

	public static BigInteger factorial(int number) {

		BigInteger factorial = BigInteger.ONE;

		for (int i = number; i > 0; i--) {
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}
		return factorial;

	}

}
