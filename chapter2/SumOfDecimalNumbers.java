package chapter2;

import java.math.BigDecimal;
import java.util.Scanner;

public class SumOfDecimalNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		double x = readDouble(input);
		
		System.out.print("Enter second number: ");
		double y = readDouble(input);
		
		BigDecimal a = new BigDecimal("" + x);
		BigDecimal b = new BigDecimal("" + y);
		BigDecimal c = a.add(b);
		
		System.out.println(c);

	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));

	}

}
