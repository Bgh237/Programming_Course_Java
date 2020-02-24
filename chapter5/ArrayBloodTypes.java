package chapter5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ArrayBloodTypes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		DecimalFormat dec = new DecimalFormat("0");

		String[] bloodType = { "A+", "O-", "AB+", "O+", "AB+", "AB+", "O-", "AB+", "O+", "AB+" };

		System.out.print("Enter blood type: ");
		String type = input.nextLine();

		double total = bloodType.length;
		double counter = 0;

		for (int i = 0; i < total; i++) {

			if (bloodType[i].contains(type)) {
				counter++;
			}

		}

		double percentage = (counter / total) * 100;
		System.out.println(dec.format(percentage) + ",0 %");
		
		input.close();
	}

}
