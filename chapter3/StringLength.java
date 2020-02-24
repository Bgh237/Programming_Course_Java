package chapter3;

import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first string: ");
		String x = input.nextLine();
		int length = 0;
		
		
		while (!"quit".contentEquals(x)) {
			length = length + x.length();
						
			System.out.print("Enter a string: ");
			x = input.nextLine();
			
		}

		System.out.println("The total length is " + length);
		
		input.close();
	}

}
