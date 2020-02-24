package Week2;

public class words {
	private String EngWord;
	private String FinWord;
	public words(String engWord, String finWord) {
		super();
		EngWord = engWord;
		FinWord = finWord;
	}
	public String getEngWord() {
		return EngWord;
	}
	public void setEngWord(String engWord) {
		EngWord = engWord;
	}
	public String getFinWord() {
		return FinWord;
	}
	public void setFinWord(String finWord) {
		FinWord = finWord;
	}
	@Override
	public String toString() {
		return getFinWord();
	}
	
}
