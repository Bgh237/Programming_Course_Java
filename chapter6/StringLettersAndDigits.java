package chapter6;

import java.util.Scanner;

public class StringLettersAndDigits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String x = input.nextLine();

		int counter1 = 0;
		int counter2 = 0;

		for (int i = 0; i < x.length(); i++) {
			if (Character.isLetterOrDigit(x.charAt(i))) {
				if (Character.isDigit(x.charAt(i))) {
					counter1++;
				} else {
					counter2++;
				}
			}
		}

		System.out.println(counter2 + " letter(s)");
		System.out.println(counter1 + " digit(s)");

		input.close();
	}

}
