package chapter4;

import java.util.Scanner;

public class MethodsMax {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first double: ");
		double a = readDouble(input);

		System.out.print("Enter second double: ");
		double b = readDouble(input);

		System.out.print("The max value is " + max(a, b));

	}

	public static double max(double a, double b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));

	}

}