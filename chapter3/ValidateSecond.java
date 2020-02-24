package chapter3;

import java.util.Scanner;

public class ValidateSecond {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.print("Enter grade (0-5) : ");
			int grade = Integer.parseInt(input.nextLine());
			
			if (grade > 5 || grade < 0) {
				System.out.println("Please enter an integer between 0 and 5.");
			} else {
				System.out.println("OK");
			}

		} catch (NumberFormatException nfe) {
			System.out.println("Please enter an integer between 0 and 5.");
		}
		input.close();
	}

}
