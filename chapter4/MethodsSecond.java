package chapter4;

import java.util.Scanner;

public class MethodsSecond {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter width: ");
		int x = Integer.parseInt(input.nextLine());

		System.out.print("Enter height: ");
		int y = Integer.parseInt(input.nextLine());

		printRectangle(x, y);
		
		input.close();
	}

	public static void printRectangle(int width, int height) {
		String output = "";
		System.out.println("\n");
		for (int i = 1; i <= width; i++) {
			output = output + "x";
		}

		for (int i = 1; i <= height; i++) {
			System.out.println(output);

		}

	}
	
}
