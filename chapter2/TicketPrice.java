package chapter2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class TicketPrice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat dec = new DecimalFormat("0.00");
		
		System.out.print("Enter price for a single ticket: ");
		double single = readDouble(input);
		
		System.out.print("Enter price for a season ticket: ");
		double season = readDouble(input);
		
		System.out.print("Enter the number of bus trips per month: ");
		int trips = Integer.parseInt(input.nextLine());
		
		String outputText;
		Double singleTrip = single*trips;
		
		if (singleTrip > season) {
			outputText = "Buying a season ticket is " + (dec.format(singleTrip - season)) + " euros cheaper."; 
		} else if (season > singleTrip) {
			outputText = "Buying single tickets is " + (dec.format(season - singleTrip)) + " euros cheaper.";
		} else {
			outputText = "There is no difference in the price.";
		}
		
		System.out.println(outputText);

	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}

}
