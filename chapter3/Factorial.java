package chapter3;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			System.out.print("Enter a non-negative integer: ");
			int x = Integer.parseInt(input.nextLine());
			int sum = 1;
			
			if (x >= 0) {
				for (int i = 2; i <= x; i++) {
					sum = sum * i;
				}

				System.out.println(x + "! = " + sum);

			} else {
				System.out.println("Please enter a non-negative integer.");
			}
		} catch (NumberFormatException nfe) {
			System.out.println("Please enter a non-negative integer.");
		}

		input.close();
	}

}
