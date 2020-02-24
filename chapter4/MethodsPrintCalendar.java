package chapter4;

import java.time.LocalDate;
import java.util.Scanner;

public class MethodsPrintCalendar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter year: ");
		int year = Integer.parseInt(input.nextLine());

		System.out.print("Enter month: ");
		int month = Integer.parseInt(input.nextLine());

		printCalendar(year, month);
		
		input.close();

	}

	public static void printCalendar(int year, int month) {
		String[] monthName = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		System.out.println();
		System.out.println(" > " + monthName[month - 1] + " " + year + " <");

		String[] day = { " Mon", " Tue", " Wed", " Thu", " Fri", " Sat", " Sun" };

		for (int i = 0; i <= 6; i++) {
			System.out.print(day[i]);
		}
		
		System.out.println();

		int i = 1;

		LocalDate myDate = LocalDate.of(year, month, i);
		
		int daysInMonth = myDate.lengthOfMonth();
		int dayOfWeek = myDate.getDayOfWeek().getValue();
		
		for (int a = 1; a < dayOfWeek; a++) {
			System.out.print("    ");
		}
		for (i = 1; i <= daysInMonth; i++) {
			
			System.out.printf("%4d", i);
			if ((dayOfWeek + (i - 1)) % 7 == 0) {
				System.out.println();
			}

		}
		System.out.println();

	}
}
