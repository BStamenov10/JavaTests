package methods;

public class Ex2 {

	public static void main(String[] args) {
		

		System.out.println(getMax(getMax(5, 6),9));
		
	}
	
	public static int getMax(int a, int b) {
		
		if (a > b) {
			return a;
		}
		
		return b;
		
	}

}
