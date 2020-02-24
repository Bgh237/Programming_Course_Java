package chapter6;

import java.util.Scanner;

public class RegExVowelsOnly {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter a string: ");
		String x = input.nextLine();
		
		if (x.matches("[aAeEiIoOuUyYäÄöÖåÅ]*") == true) {
			System.out.println("Vowels only");
		} else {
			System.out.println("Not only vowels!");
		}
		
		input.close();
	}

}