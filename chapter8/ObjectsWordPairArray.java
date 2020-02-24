package chapter8;

import java.util.ArrayList;

public class ObjectsWordPairArray {

	public static void main(String[] args) {
		WordPair firstPair = new WordPair("class", "luokka");
		WordPair secondPair = new WordPair("object", "olio");
		WordPair thirdPair = new WordPair("variable", "muuttuja");
		
		ArrayList<WordPair> wordList = new ArrayList<WordPair>();
		
		wordList.add(firstPair);
		wordList.add(secondPair);
		wordList.add(thirdPair);
		
		for (WordPair wordListObject : wordList) {
			System.out.println(wordListObject.getEnglishWord() + " = " + wordListObject.getFinnishWord());
		}

	}

}
