package arrays;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter array length: ");
        int length = scanner.nextInt();

        int[] arr = new int[length];
        int sames = 1;
        int bestSames = 1;
        int bestStart = 0;
        int lastElement = 0;

        for (int i = 0; i < arr.length; i ++)
        {
            System.out.printf("Enter {%d} element: ", i);
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length - 1; i++)
        {
        	//5 +1 = 6 ==     6
            if (arr[i] + 1 == arr[i + 1])
            {
                sames++;
                if (sames > bestSames)
                {
                    bestSames = sames;
                    lastElement = i + 1;
                    bestStart = lastElement - bestSames + 1;
                }
            }
            else sames = 1;
        }

        for (int i = bestStart; i < bestSames + bestStart; i++) {
        	System.out.printf("{%d}, ", arr[i]);
        }
		
	}

}
