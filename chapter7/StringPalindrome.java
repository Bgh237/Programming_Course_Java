package chapter7;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String a = input.nextLine();

		System.out.println(isPalindrome(a));
		
		input.close();
	}

	public static String isPalindrome(String a) {
		String b = a.replaceAll("[\\s\\,\\.\\:\\;\\?\\!\\-\"\\']", "").toLowerCase();
		String output = "";
		String f = "";

		if (a.matches("[a-zåäöA-ZÅÄÖ\\s\\,\\.\\:\\;\\?\\!\\-\"\\']+")) {

			for (int i = b.length() - 1; i >= 0; i--) {
				char k = b.charAt(i);
				f += k;
			}
			
			if (b.length() > 0 && b.matches(f)) {
				output = "The text is a palindrome.";
			} else {
				output = "No palindrome";
			}

		} else {
			output = "No palindrome";
		}
		return output;
	}
}
