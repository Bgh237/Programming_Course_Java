package chapter5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ArrayGrossPayCalculation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.print("Enter your hourly wage: ");
		double hr = readDouble(input);

		System.out.print("Enter the number of days: ");
		int days = Integer.parseInt(input.nextLine());

		int[] hours = new int[days];

		for (int i = 0; i < days; i++) {
			System.out.print("Hours worked on day " + (i + 1) + ": ");
			hours[i] = Integer.parseInt(input.nextLine());

		}

		int workHours = 0;
		double grossPay = 0;
		String output = "";

		for (int i = 0; i < hours.length; i++) {
			workHours += hours[i];

			if (hours[i] > 8) {
				grossPay += ((hours[i] - 8) * (hr * 1.5)) + (8 * hr);
			} else {
				grossPay += hours[i] * hr;
			}

			output += hours[i] + " ";
		}

		System.out.println("Total work hours is " + workHours);
		System.out.println("Gross pay is " + df.format(grossPay));
		System.out.println("You entered the following daily hours: " + output);

	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}

}
