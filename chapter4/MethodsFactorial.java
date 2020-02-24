package chapter4;

import java.util.Scanner;

public class MethodsFactorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		for (int i = 1; i <= 9; i++) {
			System.out.println(i + "! = " + factorial(i));
		}
		input.close();
	}

	public static int factorial(int x) {
		int output = 1;

		for (int i = 1; i <= x; i++) {
			output = output * i;
		}
		return output;
	}

}