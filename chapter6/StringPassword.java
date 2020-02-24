package chapter6;

import java.util.Scanner;

public class StringPassword {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter username: ");
		String name = input.nextLine();

		System.out.print("Enter password: ");
		String password = input.nextLine();

		System.out.println(validatePassword(password, name));

		input.close();
	}

	public static String validatePassword(String a, String b) {
		String x = "NOT OK";
		String y = "OK";

		if (a.length() < 8 || a.contains(b.toLowerCase())) {
			return x;
		} else {
			return y;
		}

	}

}
