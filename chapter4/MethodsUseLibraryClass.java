package chapter4;

import java.util.Scanner;

public class MethodsUseLibraryClass {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter an integer: ");
		int x = Integer.parseInt(input.nextLine());
		
		System.out.println(x + "! = " + MethodsLibrary.factorial(x));
		
		input.close();
	}

}