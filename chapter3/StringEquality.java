package chapter3;

import java.util.Scanner;

public class StringEquality {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first string: ");
		String x = input.nextLine();
		
		System.out.print("Enter second string: ");
		String y = input.nextLine();
		
		String outputText;
		
		if (x.contentEquals(y)) {
			outputText = "Equal";
		} else {
			outputText = "Not equal";
		}
		
		System.out.println(outputText);
		
		input.close();

	}

	
}
