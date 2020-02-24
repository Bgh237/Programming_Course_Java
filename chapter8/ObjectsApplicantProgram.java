package chapter8;

import java.util.ArrayList;
import java.util.Scanner;

public class ObjectsApplicantProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter 1. name: ");
		String name1 = input.nextLine();

		System.out.print("Enter points: ");
		int points1 = Integer.parseInt(input.nextLine());

		System.out.print("Enter 2. name: ");
		String name2 = input.nextLine();

		System.out.print("Enter points: ");
		int points2 = Integer.parseInt(input.nextLine());

		System.out.print("Enter 3. name: ");
		String name3 = input.nextLine();

		System.out.print("Enter points: ");
		int points3 = Integer.parseInt(input.nextLine());

		System.out.print("Enter 4. name: ");
		String name4 = input.nextLine();

		System.out.print("Enter points: ");
		int points4 = Integer.parseInt(input.nextLine());
		System.out.println();

		System.out.print("Enter the minimum of required points: ");
		int minPoints = Integer.parseInt(input.nextLine());
		System.out.println();

		Applicant firstApplicant = new Applicant(name1, points1);
		Applicant secondApplicant = new Applicant(name2, points2);
		Applicant thirdApplicant = new Applicant(name3, points3);
		Applicant fourthApplicant = new Applicant(name4, points4);

		ArrayList<Applicant> applicantList = new ArrayList<Applicant>();

		applicantList.add(firstApplicant);
		applicantList.add(secondApplicant);
		applicantList.add(thirdApplicant);
		applicantList.add(fourthApplicant);

		System.out.println("The following applicants have achived the minimum of " + minPoints + " points: ");

		for (Applicant applicantObject : applicantList) {
			if (applicantObject.getPoints() >= minPoints) {
				System.out.println(applicantObject.getName() + ", " + applicantObject.getPoints() + " points");

			}
		}
		input.close();
	}

}
