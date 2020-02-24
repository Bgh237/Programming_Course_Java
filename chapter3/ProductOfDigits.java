package chapter3;

import java.util.Scanner;

public class ProductOfDigits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int num = Integer.parseInt(input.nextLine());

		int num1 = (num % 10000) / 1000;
		int num2 = (num % 1000) / 100;
		int num3 = (num % 100) / 10;
		int num4 = (num % 10) / 1;

		int total = 0;

		if (num > 1000) {
			total = num1 * num2 * num3 * num4;
			System.out.println(total);
		} else if (num < 1000 && num >= 100) {
			total = num2 * num3 * num4;
			System.out.println(total);
		} else if (num < 100 && num >= 10) {
			total = num3 * num4;
			System.out.println(total);
		} else if (num < 0) {
			num = num * -1;
			
			if (num > 1000) {
				total = -num1 * num2 * num3 * num4;
				System.out.println(total);
			} else if (num < 1000 && num >= 100) {
				total = -num2 * num3 * num4;
				System.out.println(total);
			} else if (num < 100 && num >= 10) {
				total = -num3 * num4;
				System.out.println(total);
			}
			
		} else {
			System.out.println(num4);
		}
		input.close();
	}

}
