package Week2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ObjectsLanguageTranslationMap {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Map<String, words> wordMap = new HashMap<String, words>();

		System.out.println("=== Creating an English-Finnish dictionary (ok ends) ===");

		System.out.print("Enter an English word: ");
		String a = input.nextLine();

		if (!"ok".contentEquals(a)) {
			System.out.print("Enter a Finnish word: ");
			String b = input.nextLine();

			words x = new words(a, b);
			wordMap.put(a, x);
		}

		while (!"ok".contentEquals(a)) {
			System.out.println();
			System.out.print("Enter an English word: ");
			a = input.nextLine();
			if (!"ok".contentEquals(a)) {
				System.out.print("Enter a Finnish word: ");
				String b = input.nextLine();

				words x = new words(a, b);

				wordMap.put(a, x);
				
			}
		}
		
		System.out.println();

		System.out.println("=== English-Finnish translation service (quit ends) ===");

		System.out.print("Enter an English word: ");
		String e = input.nextLine();
		
		while (!"quit".contentEquals(e)) {
			if(wordMap.get(e) == null) {
				System.out.println("Unknown word");
			} else {
			System.out.println(wordMap.get(e));
			}
			
			System.out.println();
			
			System.out.print("Enter an English word: ");
			e = input.nextLine();
		}

		System.out.print("Bye!");
		input.close();
	}

}
