package chapter4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MethodsThird {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// DecimalFormat dec = new DecimalFormat("0.00");

		System.out.print("Enter gross salary: ");
		double x = readDouble(input);

		System.out.print("Enter income tax rate: ");
		double y = readDouble(input);

		calculateNetSalary(x, y);

		input.close();
	}

	public static void calculateNetSalary(double salary, double tax) {
		DecimalFormat dec = new DecimalFormat("0.00");
		double calc = salary - ((salary / 100) * tax);
		System.out.println("The net salary is " + dec.format(calc));

	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}

}
