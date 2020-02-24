package chapter3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AverageOfDecimalValues {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat dec = new DecimalFormat("0.00");
		
		System.out.print("Enter first number (zero ends) : ");
		double x = readDouble(input);
		int counter = 0;
		double total = 0;
		
		while (x != 0) {
			counter = counter + 1;
			total += x;
			
			System.out.print("Enter next number (zero ends) : ");
			x = readDouble(input);
			
		}
		
		if (total == 0) {
			System.out.println("Nothing to calculate");
		} else {
			System.out.println("The average is " + dec.format(total / counter));
		}
	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',',  '.'));
	}

}
