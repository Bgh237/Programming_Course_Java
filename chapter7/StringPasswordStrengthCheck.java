package chapter7;

import java.util.Scanner;

public class StringPasswordStrengthCheck {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter password: ");
		String a = input.nextLine();

		System.out.println(checkStrength(a));

		input.close();
	}

	public static String checkStrength(String a) {
		String outputA = "OK";
		String outputB = "Not strong enough!";
		String finalOutput = "";

		int upper = 0;
		int lower = 0;
		int digit = 0;
		int spec = 0;

		if (a.length() >= 8) {
			if (a.matches(".{0,}[a-z].{0,}")) {
				lower++;
			}

			if (a.matches(".{0,}[A-Z].{0,}")) {
				upper++;
			}

			if (a.matches(".{0,}[0-9].{0,}")) {
				digit++;
			}

			if (a.matches(".{0,}[^a-zA-Z0-9].{0,}")) {
				spec++;
			}

			if (upper + lower + digit + spec >= 3) {
				finalOutput = outputA;
			} else {
				finalOutput = outputB;
			}
		} else {
			finalOutput = outputB;
		}

		return finalOutput;

	}
}
