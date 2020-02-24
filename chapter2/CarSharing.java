package chapter2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CarSharing {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat dec = new DecimalFormat("0.00");
		
		System.out.print("Enter driven kilometers: ");
		Double km = readDouble(input);
		
		System.out.print("Enter fuel consumption per 100 km: ");
		Double fuel = readDouble(input);
		
		System.out.print("Enter fuel price per liter: ");
		Double price = readDouble(input);
		
		System.out.print("Enter number of people: ");
		int people = Integer.parseInt(input.nextLine());
		
		Double x = (((km / 100) * fuel) * price) / people;
		
		System.out.println("Each of the " + people + " people should pay " + dec.format(x) + " euros.");

	}

	private static Double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}

}
