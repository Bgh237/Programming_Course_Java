package chapter8;

public class ObjectsWordPairProgram {

	public static void main(String[] args) {
		WordPair firstPair = new WordPair("class", "luokka");
		WordPair secondPair = new WordPair("object", "olio");
		WordPair thirdPair = new WordPair("variable", "muuttuja");
		
		System.out.println(firstPair.getEnglishWord() + " = " + firstPair.getFinnishWord());
		System.out.println(secondPair.getEnglishWord() + " = " + secondPair.getFinnishWord());
		System.out.println(thirdPair.getEnglishWord() + " = " + thirdPair.getFinnishWord());

	}

}
