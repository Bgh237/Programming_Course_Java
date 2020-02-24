package chapter4;

public class MethodsFirst {

	public static void main(String[] args) {
		printNumbers();

	}

	public static void printNumbers() {
		String output = null;
		for (int i = 2; i <= 50; i++) {
			output =+ i + " ";
			System.out.print(output);
			i++;
		}
	}

}
