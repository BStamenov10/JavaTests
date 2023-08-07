package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		System.out.print("Enter rows for the matrix: ");
		int rows = input.nextInt();
		System.out.print("Enter cols for the matrix: ");
		int cols = input.nextInt();
		
		int[][] matrix = new int[rows][cols];
		while(true){
			
		
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				System.out.printf("matrix[%d][%d]: ", row,col);
				matrix[row][col] = input.nextInt();
			}
			System.out.println();
		}
		System.out.println(Arrays.deepToString(matrix));
		}
		

	}

}
