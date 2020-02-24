package chapter1;
import java.text.DecimalFormat;
import java.util.Scanner;

public class DecimalPlaces {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a decimal number: ");
		double decimalNumber = readDouble(input);
		
		DecimalFormat x = new DecimalFormat("0.00");
		
		System.out.println(x.format(decimalNumber));
	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}
}
