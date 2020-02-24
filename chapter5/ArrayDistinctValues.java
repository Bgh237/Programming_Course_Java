package chapter5;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDistinctValues {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of values: ");
		int a = Integer.parseInt(input.nextLine());

		int[] arr = new int[a];

		for (int i = 0; i < a; i++) {
			System.out.print("Enter an integer: ");
			arr[i] = Integer.parseInt(input.nextLine());
		}
		Arrays.sort(arr);
		
		int j = 1;
		String output = "";
		for (int i = 0; j < a; i++) {
			
			if (i == 0) {
				output += arr[i] + " ";
			}
			
			if (arr[i] != arr[j]) {
				output += arr[j] + " ";
				;
			}
			j++;
		}
		System.out.print(output);
		
		input.close();
	}

}
