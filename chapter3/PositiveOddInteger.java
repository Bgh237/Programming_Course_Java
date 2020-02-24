package chapter3;

import java.util.Scanner;

public class PositiveOddInteger {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String x = "";
		String keyword = "quit";

		while (x.contains(keyword) == false) {

			try {

				System.out.print("Enter a positive odd integer: ");
				x = input.nextLine();
				int y = Integer.parseInt(x);

				if (y % 2 == 0) {
					System.out.println("  " + y + " is not a positive odd integer" + "\n");

				} else if (y < 0) {
					System.out.println("  " + y + " is not a positive odd integer\n");

				} else {
					System.out.println("  OK" + "\n");

				}

			} catch (NumberFormatException nfe) {
				if (x.contains(keyword) == true) {
					break;
				}

				System.out.println("  '" + x + "'" + " is not a positive odd integer" + "\n");
			}

		}

		System.out.println("  " + "Bye!");

		input.close();
	}
}
