package chapter7;

import java.util.Scanner;

public class StringAnagram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first string: ");
		String a = input.nextLine();

		System.out.print("Enter second string: ");
		String b = input.nextLine();

		System.out.println(isAnagram(a, b));

		input.close();
	}

	public static String isAnagram(String a, String b) {
		String c = a.replaceAll("\\s", "").replaceAll("\\.", "").replaceAll("\\,", "").toLowerCase();
		String d = b.replaceAll("\\s", "").replaceAll("\\.", "").replaceAll("\\,", "").toLowerCase();
		int counter = 0;
		String output = "";
		
		if (a.matches("[a-zåäöA-ZÅÄÖ\\s\\.\\,]+")) {		
			for (int i = 0; i < c.length(); i++) {
				for (int j = 0; j < c.length(); j++) {
					if (c.charAt(i) == d.charAt(j)) {
						counter++;
						break;
					}
				}
			}
		} else {
			output = "No anagram.";
		}

		if (counter > 0 && counter == (c.length())) {
			output = "Anagram!";
		} else {
			output = "No anagram.";
		}
			
		return output;
	}
}

