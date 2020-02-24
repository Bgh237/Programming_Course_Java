package chapter5;

import java.util.Scanner;

public class ArrayLanguageTranslation {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		String[] eng = {"bird", "bus", "car", "cat", "dog", "school", "thanks", "train", "teacher"};
		String[] fin = {"lintu", "bussi", "auto", "kissa", "koira", "koulu", "kiitos", "juna", "opettaja"};
		
		System.out.print("Enter an English word: ");
		String x = input.nextLine();
		int counter = 0;
		
		for (int i = 0; i < eng.length; i++) {
			if (eng[i].contains(x)) {
				System.out.println(fin[i]);
				counter++;
			}
		}
		
		if (counter == 0) {
			System.out.print("Unknown word");
		}
		input.close();
	}

}
