package chapter3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat dec = new DecimalFormat("0.00");
		
		System.out.print("Enter initial deposit: ");
		double deposit = readDouble(input);
		
		System.out.print("Enter interest rate: ");
		double interestRate = readDouble(input);
		
		System.out.print("Enter capital income tax rate: ");
		double capitalTax = readDouble(input);
		
		System.out.print("Enter number of years: ");
		int years = Integer.parseInt(input.nextLine());
		
		//double IR = (deposit/100) * interestRate;
		//double CITR = (IR / 100) * capitalTax;
		//double total = deposit;
		//double total = deposit + (((deposit/100) * interestRate) - (((deposit/100) * interestRate) / 100) * capitalTax);
		
		for (int i = 1; i <= years; i++) {
			double IR = (deposit/100) * interestRate;
			double CITR = (IR / 100) * capitalTax;
			//double total = deposit;
			double amount = deposit + IR - CITR; 
			
			System.out.println(i + ": " + dec.format(amount));
			deposit = amount;
			
		}

	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}

}
