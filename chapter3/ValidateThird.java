package chapter3;

import java.util.Scanner;

public class ValidateThird {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String x = null;
		int grade = -1;

		while (grade < 0 || grade > 5) {
			try {
				System.out.print("Enter grade (0-5): ");
				x = input.nextLine();
				grade = Integer.parseInt(x);
				
				if (grade < 0 || grade > 5) {
					System.out.println(x + " is not a valid grade.");
				}
				
			} catch (NumberFormatException nfe) {
				System.out.println(x + " is not a valid grade.");
			}
		}

		if (grade >= 0 && grade <= 5) {
			System.out.println("OK");
		}
	
		input.close();
	}
	
	
}

