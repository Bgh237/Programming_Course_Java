package chapter5;

import java.util.Scanner;

public class ArrayWarmUp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] array = { 1, 5, 2, 6, 7 };

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		input.close();

	}

}
