package chapter3;

import java.util.Scanner;

public class StringCount {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first string: ");
		String words = input.nextLine();
		
		int stringCount = 0;
		
		while (words.length() > 0) {
			stringCount += 1;
			
			System.out.print("Enter a string: ");
			words = input.nextLine();
		}
		System.out.println(); //so that there is a gap between the last string and the answer as in the example
		System.out.println(stringCount + " strings");

		input.close();
	}

}
