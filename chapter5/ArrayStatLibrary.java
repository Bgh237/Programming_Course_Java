package chapter5;

import java.text.DecimalFormat;
import java.util.Arrays;

public class ArrayStatLibrary {
	public static int max(int x[]) {
		Arrays.sort(x);
		return x[x.length - 1];
	}

	public static void min(int x[]) {
		Arrays.sort(x);
		System.out.println("Min: " + x[0]);
	}

	public static void median(int x[]) {
		DecimalFormat dec = new DecimalFormat("0.0");
		Arrays.sort(x);
		double mid = x.length / 2;

		if (x.length % 2 != 0) {
			System.out.println("Median: " + dec.format(x[(int) mid]));
		} else {
			System.out.println("Median: " + dec.format(((x[(int) mid] + x[(int) (mid + 1)]) / 2)));
		}
	}

	public static double mean(int x[]) {
		double sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		double mean = sum / x.length;
		return mean;
	}

	public static void standardDeviation(int x[]) {
		DecimalFormat dec = new DecimalFormat("0.0");
		double a = ArrayStatLibrary.mean(x);
		double b = 0;

		for (int i = 0; i < x.length; i++) {
			b += (x[i] - a) * (x[i] - a);
		}

		double squaredMean = b / (x.length - 1);
		double sd = Math.sqrt(squaredMean);

		System.out.println("Sample standard deviation: " + dec.format(sd));

	}
}
