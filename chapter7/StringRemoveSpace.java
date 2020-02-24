package chapter7;

import java.util.Scanner;

public class StringRemoveSpace {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter a string: ");
		String a = input.nextLine();
		
		a.trim();
		System.out.println("\"" + removeExtraSpace(a) + "\"");
		input.close();
	}
	
	public static String removeExtraSpace(String a) {
		return a.replaceAll("\\s+", " ");
		
	}
}