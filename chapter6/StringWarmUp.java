package chapter6;

import java.util.Scanner;

public class StringWarmUp {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter a string: ");
		String x = input.nextLine();
		
		System.out.println(x.length() + " characters");
		System.out.println(x.toUpperCase());
		System.out.println(x.toLowerCase());
		
		input.close();
	}

}
