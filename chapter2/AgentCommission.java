package chapter2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AgentCommission {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		DecimalFormat y = new DecimalFormat("0.00");
				
		System.out.print("Enter selling price: ");
		double price = readDouble(input);
		
		double commission = (price * 0.0344);
		
		double x;
		
		if (commission <= 2400.00) {
			x = 2400.00;
		} else {
			x = price * 0.0344;
		}
		
		System.out.println("The commission is " + y.format(x) + " euros.");
	}
	
	private static double readDouble(Scanner input) {
		 return Double.parseDouble(input.nextLine().replace(',', '.'));
		 }

}
