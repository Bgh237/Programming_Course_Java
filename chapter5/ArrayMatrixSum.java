package chapter5;

public class ArrayMatrixSum {

	public static void main(String[] args) {
		int[][] first = { { 1, 2, 0 }, { 2, 3, 4 } };
		int[][] second = { { 3, 2, 5 }, { 6, 4, 3 } };
		int[][] third = { { 1, 1, 1, 1 }, { 4, 3, 2, 1 }, { 2, 2, 2, 2 } };
		int[][] fourth = { { 2, 2, 2, 3 }, { 2, 3, 2, 0 }, { 1, 2, 3, 4 } };

		printSum(first, second);
		System.out.println();

		printSum(third, fourth);
	}

	public static void printSum(int x[][], int y[][]) {
		String result1 = "";
		int sum1 = 0;

		for (int i = 0; i < x.length; i++) {

			for (int j = 0; j < x[i].length; j++) {
				sum1 = x[i][j] + y[i][j];
				result1 += sum1 + " ";
			}
			System.out.println(result1);
			result1 = "";
		}

		
	}

}
