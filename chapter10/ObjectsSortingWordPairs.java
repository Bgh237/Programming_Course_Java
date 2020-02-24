package chapter10;

import java.util.ArrayList;
import java.util.Scanner;

public class ObjectsSortingWordPairs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<WordPair> wordList = new ArrayList<WordPair>();

		System.out.print("Enter an English word (quit ends): ");
		String a = input.nextLine();

		if (!"quit".contentEquals(a)) {
			System.out.print("Enter a Finnish word: ");
			String b = input.nextLine();

			WordPair x = new WordPair(a, b);
			wordList.add(x);
		}

		while (!"quit".contentEquals(a)) {
			System.out.print("Enter an English word (quit ends): ");
			a = input.nextLine();
			if (!"quit".contentEquals(a)) {
				System.out.print("Enter a Finnish word: ");
				String b = input.nextLine();

				WordPair x = new WordPair(a, b);

				wordList.add(x);
			}
		}
		System.out.println();

		wordList.sort((WordPair c, WordPair b) -> c.getEnglishWord().compareTo(b.getEnglishWord()));
		
		for (WordPair wordObject : wordList) {
			System.out.println(wordObject.getEnglishWord() + " = " + wordObject.getFinnishWord());
		}
		
		System.out.println();
		
		wordList.sort((WordPair c, WordPair b) -> c.getFinnishWord().compareTo(b.getFinnishWord()));
		
		for (WordPair wordObject : wordList) {
			System.out.println(wordObject.getFinnishWord() + " = " + wordObject.getEnglishWord());
		}

		input.close();

	}

}
