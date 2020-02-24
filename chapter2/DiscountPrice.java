package chapter2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DiscountPrice {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter original price: ");
		double price = readDouble(input);
		
		System.out.print("Enter discount percentage: ");
		double discount = readDouble(input);
		
		DecimalFormat x = new DecimalFormat("0.00");
		
		System.out.println("The final price is " + (x.format(price - (price * (discount/100)))));
	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}
}
