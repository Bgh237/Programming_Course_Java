package chapter5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ArrayStatistics {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat dec = new DecimalFormat("0.0");

		System.out.print("Enter the number of values: ");
		int x = Integer.parseInt(input.nextLine());

		int[] y = new int[x];

		if (x > 2) {
			for (int i = 0; i < x; i++) {
				System.out.print("Enter an integer: ");
				y[i] = Integer.parseInt(input.nextLine());
			}
		} else {
			System.out.println("Sorry, at least 3 values required");
		}

		String data = "";

		for (int i = 0; i < y.length; i++) {
			data += y[i] + " ";
		}

		if (x > 2) {
			System.out.println();
			System.out.println("n = " + x);
			ArrayStatLibrary.min(y);
			System.out.println("Max: " + ArrayStatLibrary.max(y));
			ArrayStatLibrary.median(y);
			System.out.println("Mean: " + dec.format(ArrayStatLibrary.mean(y)));
			ArrayStatLibrary.standardDeviation(y);
			System.out.print("Sample data: " + data);
		}

		input.close();
	}

}
