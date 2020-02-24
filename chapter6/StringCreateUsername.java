package chapter6;

import java.util.Scanner;

public class StringCreateUsername {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first name: ");
		String name1 = input.nextLine();

		System.out.print("Enter surname: ");
		String name2 = input.nextLine();

		System.out.println(createUsername(name1, name2));
		
		input.close();
	}

	public static String createUsername(String a, String b) {
		String good = "";
		String bad = "Not enough letters to create a username!";
		
		
		if (a.length() < 2 || b.length() < 3) {
			return bad;
		} else {
			good += b.toLowerCase().substring(0, 3);
			good += a.toLowerCase().substring(0, 2);
			return good;
		}

	}

}