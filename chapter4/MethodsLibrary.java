package chapter4;

public class MethodsLibrary {

	public static int factorial(int x) {
		int output = 1;

		for (int i = 1; i <= x; i++) {
			output = output * i;
		}
		return output;
	}
}
