package chapter2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DrivingCost {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat y = new DecimalFormat("0.00");
		
		System.out.print("Enter driven kilometers: ");
		int km = Integer.parseInt(input.nextLine());
		
		System.out.print("Enter amount of fuel consumed: ");
		double fuel = readDouble(input);
		
		System.out.print("Enter fuel price per liter: ");
		double price = readDouble(input);
		
		double x = (fuel * price) / km;
		
		System.out.println("The cost per kilometer is " + y.format(x) + " euros.");

	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',',  '.'));
	}

}
