package chapter7;

import java.util.Scanner;

public class StringDecimalPartLength {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		try {
		System.out.print("Enter a decimal number: ");
		String x = input.nextLine();
		
		double a = readDouble(x);
		int comma = x.indexOf(",");
		int dot = x.indexOf(".");
		int totalLength = x.length() - 1;
		int decimals = 0;
		
		
		if (comma >= 1) {
			decimals = totalLength - comma;
		} else if (dot >= 1) {
			decimals = totalLength - dot;
		}
			
		if (decimals > 0) {
			System.out.println(decimals + " decimal place(s)");
		} else {
			System.out.println("Please enter a proper decimal number");
		}
		
		
		} catch (NumberFormatException nfe) {
			System.out.println("Please enter a proper decimal number");
		}
		input.close();

	}

	private static double readDouble(String x) {
		 return Double.parseDouble(x.replace(',', '.'));
		 }
}
