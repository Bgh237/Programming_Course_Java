package chapter9;

import java.util.ArrayList;
import java.util.Scanner;

public class ObjectsLanguageTranslationArrayList {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<WordPair> wordList = new ArrayList<WordPair>();

		System.out.println("=== Creating an English-Finnish dictionary (ok ends) ===");

		System.out.print("Enter an English word: ");
		String a = input.nextLine();
		
		if (!"ok".contentEquals(a)) {
			System.out.print("Enter a Finnish word: ");
			String b = input.nextLine();
			
			WordPair x = new WordPair(a, b);
			wordList.add(x);
		}

		while (!"ok".contentEquals(a)) {
			System.out.print("Enter an English word: ");
			a = input.nextLine();
			if (!"ok".contentEquals(a)) {
				System.out.print("Enter a Finnish word: ");
				String b = input.nextLine();

				WordPair x = new WordPair(a, b);

				wordList.add(x);
			}
		}

		System.out.println("=== English-Finnish translation service (quit ends) ===");

		System.out.print("Enter an English word: ");
		String e = input.nextLine();
		int counter = 0;

		while (!"quit".contentEquals(e)) {
			for (int i = 0; i < wordList.size(); i++) {
				if (e.contains(wordList.get(i).getEnglishWord())) {
					System.out.println(wordList.get(i).getFinnishWord());
				} else {
					counter++;
				}
			}

			if (counter >= wordList.size()) {
				System.out.println("Unknown word");
			}

			System.out.print("Enter an English word: ");
			e = input.nextLine();
		}
		
		System.out.println("Bye!");
		input.close();
	}
}
