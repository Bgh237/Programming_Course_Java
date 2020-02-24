package chapter6;

import java.util.Scanner;

public class StringBackwards {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String x = input.nextLine();

		System.out.println(reverse(x));

		input.close();
	}

	public static String reverse(String a) {
		String newString = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			newString += a.charAt(i);
		}
		return newString;
	}
}
